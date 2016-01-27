/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PropertiesAndAgentsAndTasks.Properties;

import UI.PropertiesAndAgentsAndTasks.AgentsHetero;
import UI.PropertiesAndAgentsAndTasks.PropertiesTree;
import java.awt.Color;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class PropertyController implements Initializable {

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fadeIn.setNode(savedBack);
        fadeIn.setFromValue(1.0);
        fadeIn.setToValue(0.0);
        fadeIn.setCycleCount(1);
        fadeIn.setAutoReverse(false);
        fadeIn.setOnFinished((ActionEvent event) -> {
            savedBack.setVisible(false);
        });
    }

    @FXML
    private TextField NameTF, ValueTF, MetericTF;
    @FXML
    private RadioButton isBool, isNum, isText;
    @FXML
    private Button OKButton;
    @FXML
    private CheckBox BoolValue;
    @FXML
    private Label MetericLable, WarrName, WarrType, WarrValue;
    @FXML
    private ToggleGroup RadioButtonGroup1;
    @FXML
    private Label savedBack;

    private final FadeTransition fadeIn = new FadeTransition(Duration.millis(3000));

    /**
     * 1-Adding and show name warning if the same property name 2-Reset and hide
     * name warning if typing any other.
     */
    public void NameTFKeyPressed() {
        String str = NameTF.getText();
        for (Modules.Property p : Modules.Property.getProperties()) {
            if (p.getName().equals(str)) {
                OKButton.setText("Update Property");
                WarrName.setText("Updating Property!");
                WarrName.setStyle("-fx-text-fill:yellow;");
                WarrName.setVisible(true);
                return;
            }
        }
        WarrName.setText("*Must have a name");
        WarrName.setStyle("-fx-text-fill:red;");
        WarrName.setVisible(false);
        OKButton.setText("Add Property");
    }

    public void RadioBoxPresseed() {
        WarrType.setVisible(false);
        WarrValue.setVisible(false);
    }

    public void isBoolChoose() {
        ValueTF.setVisible(false);
        BoolValue.setVisible(true);
        MetericTF.setEditable(false);
        MetericTF.setDisable(true);
        MetericLable.setDisable(true);
    }

    public void isNumChoose() {
        ValueTF.setVisible(true);
        BoolValue.setVisible(false);
        MetericTF.setDisable(false);
        MetericLable.setDisable(false);
    }

    public void isTextChoose() {
        ValueTF.setVisible(true);
        BoolValue.setVisible(false);
        MetericTF.setDisable(false);
        MetericLable.setDisable(false);
    }

    /**
     * hide value warning on click on value text field.
     */
    public void ValueTFFocusGained() {
        WarrValue.setVisible(false);
    }

    /**
     * 1Disable okButton 2Read TextField & (show warning,enable okButton, exit)
     * if empty 3show type warning if no type chosen 4Read Value of
     * propertyValue 5show value warning if type is number and value is not
     * number
     */
    public void OKButtonClicked() {
        /*--- 1Disable ok button ---*/
        OKButton.setDisable(true);
        /*--- 2Read TextField & (show warning,enable okButton, exit) if empty ---*/
        String propName = NameTF.getText();
        if ("".equals(propName)) {
            WarrName.setVisible(true);
            OKButton.setDisable(false);
            return;
        }
        /*--- 3show type warning if no type chosen ---*/
        if (RadioButtonGroup1.getSelectedToggle() == null) {
            WarrType.setVisible(true);
            OKButton.setDisable(false);
            return;
        }
        /*--- 4Read Value of propertyValue---*/
        boolean bValue = BoolValue.isSelected();
        int nValue = -1;
        String tValue = ValueTF.getText();
        /*--- 5show value warning if type is number and value is not number ---*/
        if (isNum.isSelected()) {
            try {
                if (!"".equals(tValue)) {
                    nValue = Integer.parseInt(tValue);
                }
            } catch (NumberFormatException e) {
                WarrValue.setVisible(true);
                OKButton.setDisable(false);
                return;
            }
        }

        String propMeteric = MetericTF.getText();
        String strSavingValues = propName + "::";
        //--Update if Property modified--//
        for (Modules.Property p : Modules.Property.getProperties()) {
            if (p.getName().compareToIgnoreCase(propName) == 0) {
                System.out.println("WWW Update property not creat new WWW");
                if (isBool.isSelected()) {
                    p.setType(0);
                    p.setValue(bValue);
                    strSavingValues += "Bool\t" + bValue;
                }
                if (isNum.isSelected()) {
                    p.setType(1);
                    p.setValue(nValue);
                    strSavingValues += "Num\t" + nValue;
                }
                if (isText.isSelected()) {
                    p.setType(2);
                    p.setValue(tValue);
                    strSavingValues += "Text\t" + tValue;
                }
                p.setMeteric(propMeteric);
                strSavingValues += " " + propMeteric + "\t\t Saved";
//                PropertiesTree.refreshTree();
                WarrName.setText("*Must have a name");
                WarrName.setStyle("-fx-text-fill:red;");
                WarrName.setVisible(false);

                OKButton.setDisable(false);
                savedBack.setText(strSavingValues);
                if (!savedBack.isVisible()) {
                    savedBack.setVisible(true);
                    fadeIn.playFromStart();
                }//442901404500489
                resetPropertyUI();
                OKButton.setText("Add Property");
                return; // if not willing to update ...
            }
        }
        //--Add new--//
        if (isBool.isSelected()) {
            Modules.Property.getProperties().add(new Modules.Property(propName, 0, bValue, propMeteric));
            strSavingValues += "Bool\t" + bValue + " \t\t Saved";
        } else if (isNum.isSelected()) {
            Modules.Property.getProperties().add(new Modules.Property(propName, 1, nValue, propMeteric));
            strSavingValues += "Num\t" + nValue + " " + propMeteric + "\t\t Saved";
        } else if (isText.isSelected()) {
            Modules.Property.getProperties().add(new Modules.Property(propName, 2, tValue, propMeteric));
            strSavingValues += "Text\t" + tValue + " " + propMeteric + "\t\t Saved";
        }
        //Update Property Tree
//        PropertiesTree.refreshTree();
        //Update Table Of Agent Task Selection on Hetero
        if (Modules.Agent.getHemogeniousValue() == 2) {
            AgentsHetero.fillTable();
        }
        OKButton.setDisable(false);
        savedBack.setText(strSavingValues);
        if (!savedBack.isVisible()) {
            savedBack.setVisible(true);
            fadeIn.playFromStart();
        }
        resetPropertyUI();
    }

    /**
     * reset all UI to origin start values hide and show.
     */
    public void resetPropertyUI() {
        NameTF.setText("");
        RadioButtonGroup1.selectToggle(null);
        ValueTF.setText("");
        ValueTF.setVisible(true);
        BoolValue.setVisible(false);
        MetericTF.setText("");
        MetericTF.setEditable(true);
        MetericTF.setDisable(false);
        MetericLable.setDisable(false);
        OKButton.setText("Add Property");
    }

}
