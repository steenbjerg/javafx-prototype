package dk.stonemountain.demo.java;

import java.util.logging.Logger;

import dk.stonemountain.demo.java.domain.KeycloakClient;
import dk.stonemountain.demo.java.services.ModelLoader;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeView;

public class KeycloakController extends ApplicationController {
    private static final Logger LOG = Logger.getLogger(KeycloakController.class.getName());

    @FXML
    private ListView<KeycloakClient> clientView;

    @FXML
    private TreeView<KeycloakClient> dependenciesView;

    @FXML
    private TitledPane dependents;

    @FXML
    public void initialize() {
        super.initialize();
        clientView.setCellFactory(p -> new ListCell<KeycloakClient>() {
            @Override
            protected void updateItem(KeycloakClient item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getClientId());
                }
            }
        });
        clientView.setItems(FXCollections.observableList(ModelLoader.getClients()));
        clientView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            LOG.info("Selected client: " + newVal);
        });
    }
    
    @FXML
    void doReloadClient(ActionEvent event) {
    }

    @FXML
    void doShowRoles(ActionEvent event) {

    }
}
