package dk.stonemountain.demo.java;

import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class ApplicationController {
    private static final Logger LOG = Logger.getLogger(ApplicationController.class.getName());
    
    @FXML
    public void initialize() {
    }

    @FXML
    public void doQuit() {
        Platform.exit();
    }

    @FXML
    public void doAbout() {
        LOG.info("About action triggered");
    }
}