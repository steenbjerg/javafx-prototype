package dk.stonemountain.demo.java;

import java.text.MessageFormat;
import java.util.logging.Logger;

import javafx.application.Application;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    
    public static void main(String[] args) {
        LOG.info(() -> MessageFormat.format("Starting up: command = {0}, command line = {1}", 
                ProcessHandle.current().info().command(), 
                ProcessHandle.current().info().commandLine().orElse("")));
        
        // Launch the JavaFX application
        Application.launch(JavaFXApplication.class, args);
    }
}