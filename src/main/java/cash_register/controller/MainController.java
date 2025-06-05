package cash_register.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    private void handleStartSale(ActionEvent event) {
        System.out.println("Kassenvorgang starten clicked");
        // TODO: öffne Verkauf-Fenster
    }

    @FXML
    private void handleAddProduct(ActionEvent event) {
        System.out.println("Neues Produkt hinzufügen clicked");
        // TODO: öffne Produkt hinzufügen-Fenster
    }

    @FXML
    private void handleStockIn(ActionEvent event) {
        System.out.println("Warenzugang erfassen clicked");
        // TODO: öffne Warenzugang-Fenster
    }

    @FXML
    private void handleShowStock(ActionEvent event) {
        System.out.println("Lagerbestand anzeigen clicked");
        // TODO: öffne Lagerbestand-Fenster
    }

    @FXML
    private void handleExit(ActionEvent event) {
        System.exit(0);
    }
}