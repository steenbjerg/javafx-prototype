package dk.stonemountain.demo.java;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class ApplicationController {
    @FXML
    private void initialize() {
    }

    @FXML
    private void doQuit() {
        Platform.exit();
    }

    @FXML
    private void doAbout() {
        System.out.println("About action triggered");
    }
}