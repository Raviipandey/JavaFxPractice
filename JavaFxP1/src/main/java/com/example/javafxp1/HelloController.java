package com.example.javafxp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle opcircle;
    private double x ;
    private  double y;

    @FXML
    protected void onUpButtonClick()
    {
        opcircle.setCenterY(y=y-5);
    }

    @FXML
    protected void onDownButtonClick()
    {
        opcircle.setCenterY(y=y+5);
    }

    @FXML
    protected void onRightButtonClick()
    {
        opcircle.setCenterX(x=x+5);
    }

    @FXML
    protected void onLeftButtonClick()
    {
        opcircle.setCenterX(x=x-5);
    }

    @FXML
    protected void onResetButtonClick()
    {
        opcircle.setCenterX(x=0);
        opcircle.setCenterY(y=0);
    }

}