package dk.stonemountain.demo.java.domain;

import java.time.LocalDateTime;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DeploymentInformation {

    public enum CrState {
        SUCCESS,
        FAILED
    }

    StringProperty consoleLink = new SimpleStringProperty();
    ObjectProperty<CrState> crState = new SimpleObjectProperty<>();
    ObjectProperty<LocalDateTime> crDeploymentTime = new SimpleObjectProperty<>();
    
    public DeploymentInformation(String consoleLink, CrState crState, LocalDateTime crDeploymentTime) {
        this.consoleLink.set(consoleLink);
        this.crState.set(crState);
        this.crDeploymentTime.set(crDeploymentTime);
    }

    
    public String getConsoleLink() {
        return consoleLink.get();
    }

    public StringProperty consoleLinkProperty() {
        return consoleLink;
    }

    public void setConsoleLink(String consoleLink) {
        this.consoleLink.set(consoleLink);
    }

    public CrState getCrState() {
        return crState.get();
    }

    public ObjectProperty<CrState> crStateProperty() {
        return crState;
    }

    public void setCrState(CrState crState) {
        this.crState.set(crState);
    }

    public LocalDateTime getCrDeploymentTime() {
        return crDeploymentTime.get();
    }

    public ObjectProperty<LocalDateTime> crDeploymentTimeProperty() {
        return crDeploymentTime;
    }

    public void setCrDeploymentTime(LocalDateTime crDeploymentTime) {
        this.crDeploymentTime.set(crDeploymentTime);
    }
    
    @Override
    public String toString() {
        return "DeploymentInformation{" +
                "consoleLink='" + consoleLink + '\'' +
                ", crState=" + crState +
                ", crDeploymentTime=" + crDeploymentTime +
                '}';
    }
}
