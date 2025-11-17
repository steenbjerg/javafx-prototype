package dk.stonemountain.demo.java.services;

import java.util.List;

import dk.stonemountain.demo.java.domain.KeycloakClient;

public class ModelLoader {
    private static List<KeycloakClient> clients = List.of(
        new KeycloakClient("amlinvestigator", "kernebank", "amlinvestigator"),
        new KeycloakClient("boligvejviser", "bolig", "bolig-vejviser"),
        new KeycloakClient("cluster-configurator-bff", "cluster-configurator", "cluster-configurator-bff")
    );
    
    public static List<KeycloakClient> getClients() {
        return clients;
    }
}
