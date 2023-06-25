package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class Restaurant {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    McDonald mcdonald = new McDonald();
    Jollibee jollibee = new Jollibee();
    Greenwich greenwich = new Greenwich();
    BurgerKing burgerking = new BurgerKing();
    KFC kfc = new KFC ();


    public void initialize() {

        mcdonald.setColor("Yellow");
        mcdonald.setTaste("Crispy");

        jollibee.setColor("Red");
        jollibee.setTaste("Juicy");

        greenwich.setColor("Green");
        greenwich.setTaste("Cheesy");

        kfc.setColor("White");
        kfc.setTaste("Many Herbs");

        burgerking.setColor("Blue");
        burgerking.setTaste("Beefy");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Mcdonals are " + mcdonald.getColor() + " and " + mcdonald.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Jollibee are " + jollibee.getColor() + " and " + jollibee.getTaste());
        }
        
        if (sourceButton == btn3) {
            alert.setContentText("Greenwich are " + greenwich.getColor() + " and " + greenwich.getTaste());
        }
        
        if (sourceButton == btn4) {
            alert.setContentText("KFC are " + kfc.getColor() + " and " + kfc.getTaste());
        }
        
        if (sourceButton == btn5) {
            alert.setContentText("BurgerKIng are " + burgerking.getColor() + " and " + burgerking.getTaste());
        }




        alert.showAndWait();

    }
}