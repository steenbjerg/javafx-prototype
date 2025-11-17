package dk.stonemountain.demo.java.domain;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class KeycloakClient {
    StringProperty name = new SimpleStringProperty();
    StringProperty namespace = new SimpleStringProperty();
    StringProperty clientId = new SimpleStringProperty();

    public KeycloakClient(String name, String namespace, String clientId) {
        this.name.set(name);
        this.namespace.set(namespace);
        this.clientId.set(clientId);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getNamespace() {
        return namespace.get();
    }

    public StringProperty namespaceProperty() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace.set(namespace);
    }

    public String getClientId() {
        return clientId.get();
    }

    public StringProperty clientIdProperty() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId.set(clientId);
    }
    
    
    @Override
    public String toString() {
        return "KeycloakClient{" +
                "name=" + name.get() +
                ", namespace=" + namespace.get() +
                ", clientId=" + clientId.get() +
                '}';
    }
}
