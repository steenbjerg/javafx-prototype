package dk.stonemountain.demo.java;

import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {
    private static final Logger LOG = Logger.getLogger(JavaFXApplication.class.getName());
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/prototype.fxml"));
        Parent root = loader.load();        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(ApplicationConfiguration.instance.getStyleSheet());
        primaryStage.setTitle(ApplicationConfiguration.instance.getName());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    @Override
    public void stop() {
        LOG.info("Application stopped");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}