/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.MediaTracker;
import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author M Ghanem
 */
public class MAMTA extends Application {

    private static final int JFXPANEL_WIDTH_INT = 300;
    private static final int JFXPANEL_HEIGHT_INT = 250;
    private static JFXPanel fxContainer;
    private static SplashWindow sFrame;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private static void initSplashScreen() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        ImageIcon splashScreenImage = new ImageIcon("Images\\mamt.png");
        if (splashScreenImage.getImageLoadStatus() == MediaTracker.ERRORED) {
            return;
        }
        sFrame = new SplashWindow(splashScreenImage, "Java for Multi-Robot Systems");
        sFrame.setVisible(true);
        sFrame.start();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MAMTA.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
