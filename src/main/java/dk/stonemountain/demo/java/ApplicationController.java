package dk.stonemountain.demo.java;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class ApplicationController {
    @FXML
    public void initialize() {
    }

    @FXML
    public void doQuit() {
        Platform.exit();
    }

    @FXML
    public void doAbout() {
        System.out.println("About action triggered");
    }
}