package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField ans, num1, num2;

    @FXML
    protected void onaddButtonClick() {
        double First_no = Double.parseDouble(num1.getText());
        double Sec_no = Double.parseDouble(num2.getText());
        double Answer = First_no + Sec_no;
        ans.setText(String.valueOf(Answer));
    }

    @FXML
    protected void onsubButtonClick() {
        double First_no = Double.parseDouble(num1.getText());
        double Sec_no = Double.parseDouble(num2.getText());
        double Answer = First_no - Sec_no;
        ans.setText(String.valueOf(Answer));
    }

    @FXML
    protected void onprodButtonClick() {
        double First_no = Double.parseDouble(num1.getText());
        double Sec_no = Double.parseDouble(num2.getText());
        double Answer = First_no * Sec_no;
        ans.setText(String.valueOf(Answer));
    }
    @FXML
    protected void ondivButtonClick() {
        double First_no = Double.parseDouble(num1.getText());
        double Sec_no = Double.parseDouble(num2.getText());
        double Answer = First_no / Sec_no;
        ans.setText(String.valueOf(Answer));
    }
}