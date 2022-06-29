package Practicum9b.hotel.userinterface;


import Practicum9b.hotel.model.Hotel;
import Practicum9b.hotel.model.KamerType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.time.LocalDate;
import java.util.List;


public class BoekingenController {
    @FXML
    private TextField Naam;
    @FXML
    private TextField Adres;
    @FXML
    private DatePicker Aankomstdatum;
    @FXML
    private DatePicker Vertrekdatum;
    @FXML
    private ComboBox <KamerType> Kamertype;
    @FXML
    private Label Error;

    private Hotel hotel = Hotel.getHotel();

    public void initialize(){
        ObservableList<KamerType> kamerTypes = FXCollections.observableArrayList();
        List<KamerType> kamers = hotel.getKamerTypen();
        kamerTypes.addAll(kamers);
        Kamertype.setItems(kamerTypes);
        Vertrekdatum.setValue(LocalDate.now().plusDays(3));
        Aankomstdatum.setValue(LocalDate.now());
    }


    public void buttonBoek(ActionEvent actionEvent){
        try {
            if(Naam.getText() == null || Naam.getText().equals("")){
                throw new Exception("Naam is leeg!");
            }

            if(Adres.getText() == null || Adres.getText().equals("")){
                throw new Exception("Adres is leeg!");
            }

            if(Aankomstdatum.getValue().isAfter(Vertrekdatum.getValue())){
                throw new Exception("Aankomst datum kan niet na de vertrek datum!");
            }

            if(Aankomstdatum.getValue().isBefore(LocalDate.now())){
                throw new Exception("Aankomst datum ligt in het verleden!");
            }

            if(Kamertype.getValue() == null){
                throw new Exception("Kamer type is niet geselecteerd!");
            }

            hotel.voegBoekingToe(Aankomstdatum.getValue(), Vertrekdatum.getValue(), Naam.getText(), Adres.getText(), Kamertype.getValue());
            Error.setTextFill(Color.GREEN);
            Error.setText("Boeking is voldaan");

        }
        catch (Exception e){
            Error.setTextFill(Color.RED);
            Error.setText(e.getMessage());

        }

    }

    public void buttonReset(ActionEvent actionEvent) {
        Aankomstdatum.setValue(LocalDate.now());
        Vertrekdatum.setValue(LocalDate.now().plusDays(3));
        Naam.setText("");
        Adres.setText("");
        Kamertype.setValue(null);
    }



}
