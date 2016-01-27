/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PropertiesAndAgentsAndTasks;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class PropertiesAndAgentsAndTasksController implements Initializable {

    @FXML
    private AnchorPane ALL;
    @FXML
    private SplitPane SP;
    @FXML
    private AnchorPane LeftPart;
    @FXML
    private AnchorPane RightPart;
    @FXML
    private ToolBar RTB;
    @FXML
    private ToolBar LTB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void hideLeftPart() {
        SP.getItems().remove(LeftPart);
        LTB.setVisible(true);
    }

    public void showLeftPart() {
        SP.getItems().add(0,LeftPart);
        LTB.setVisible(false);
    }

    public void hideRightPart() {
        SP.getItems().remove(RightPart);
        RTB.setVisible(true);
    }

    public void showRightPart() {
        SP.getItems().add(RightPart);
        RTB.setVisible(false);
    }

}
