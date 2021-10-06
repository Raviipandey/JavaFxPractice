package com.example.javafxp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle OpCircle;
    private double x;
    private double y;

    @FXML
    protected void onupButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
        //System.out.println("UP");
        OpCircle.setCenterY(y=y-10);

    }
    @FXML
    protected void ondownButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
        //System.out.println("DOWN");
        OpCircle.setCenterY(y=y+10);
    }
    @FXML
    protected void onleftButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
        //System.out.println("LEFT");
        OpCircle.setCenterX(x=x-10);
    }
    @FXML
    protected void onrightButtonClick() {
//        System.out.println("RIGHT");
//        welcomeText.setText("Welcome to JavaFX Application!");
        OpCircle.setCenterX(x=x+10);
    }
    @FXML
    protected void onresetButtonClick(){
        OpCircle.setCenterX(x=0);
        OpCircle.setCenterY(y=0);
    }
}