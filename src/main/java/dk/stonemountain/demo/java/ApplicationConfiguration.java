package dk.stonemountain.demo.java;

public class ApplicationConfiguration {
    public static final ApplicationConfiguration instance = new ApplicationConfiguration("Keycloak Clients", "dark.css");

    private String name;
    private String styleSheet;

    public ApplicationConfiguration(String name, String styleSheet) {
        this.name = name;
        this.styleSheet = styleSheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyleSheet() {
        return styleSheet;
    }

    public void setStyleSheet(String styleSheet) {
        this.styleSheet = styleSheet;
    }
}
