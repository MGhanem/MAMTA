/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class MAMTAController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private Label t1, t2, t3, t4, t5, t6;

    @FXML
    private TabPane allTabs;

    @FXML
    public void t1clicked() {
        showTab(0);
    }

    @FXML
    public void t2clicked() {
        showTab(1);
    }

    @FXML
    public void t3clicked() {
        showTab(2);
    }

    @FXML
    public void t4clicked() {
        showTab(3);
    }

    @FXML
    public void t5clicked() {
        showTab(4);
    }

    @FXML
    public void t6clicked() {
        showTab(5);
    }

    @FXML
    public void tentered() {
        t1.setStyle("-fx-text-fill:lime; -fx-font-weight:bold;");
    }
    @FXML
    public void texited() {
        t1.setStyle("-fx-text-fill:white; -fx-font-weight:regular;");
    }
    private void showTab(int i) {
        allTabs.getSelectionModel().select(i);
    }

}
