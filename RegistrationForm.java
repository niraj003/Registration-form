
package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class RegistrationForm extends Application {
    Stage window;
    Scene scene1,scene2;
    @Override
    public void start(Stage primarily)  {

        window= primarily;



        Label L = new Label("Registration Form");
        Label f_name = new Label("First Name");
        Label m_name = new Label("Middle Name");
        Label l_name = new Label("Last Name");
        Label email = new Label("Email");
        Label dob = new Label("Date of birth");
        Label gender = new Label("Gender");
        Label l_knows = new Label("Languages knows");
        Label s_2 = new Label("");


        s_2.setStyle("-fx-font: 40px CENTER");




        TextField f_t = new TextField();
        TextField m_t = new TextField();
        TextField l_t = new TextField();
        TextField email_t = new TextField();
        DatePicker dob_t = new DatePicker();
        ToggleGroup G = new ToggleGroup();
        RadioButton male = new RadioButton("maLe");
        RadioButton female = new RadioButton("femaLe");
        male.setToggleGroup(G);
        female.setToggleGroup(G);
        CheckBox hindi = new CheckBox("Hindi");
        CheckBox gujarati = new CheckBox("Gujarati");
        CheckBox english = new CheckBox("English");
        Button cancel = new Button("Cancel");
        Button submit = new Button("Submit");



        submit.setOnAction(e->{
            window.setScene(scene2);
            String name=m_t.getText();
            s_2.setText("Hello "+name+" Welcome to javafx");
        });


        cancel.setOnAction(e->{
            f_t.setText(null);
            m_t.setText(null);
            l_t.setText(null);
            email_t.setText(null);
            hindi.setSelected(false);
            gujarati.setSelected(false);
            english.setSelected(false);
            male.setSelected(false);
            female.setSelected(false);
            dob_t.getEditor().clear();
        });







        GridPane root2 = new GridPane();
        root2.getChildren().add(s_2);
        root2.setAlignment(Pos.CENTER);






        GridPane root = new GridPane();
        root.setVgap(10);
        root.addRow(0, L);
        root.addRow(1, f_name, f_t);
        root.addRow(2, m_name, m_t);
        root.addRow(3, l_name, l_t);
        root.addRow(4, email, email_t);
        root.addRow(5, dob, dob_t);
        root.addRow(6, gender, male, female);
        root.addRow(7, l_knows, hindi, gujarati, english);
        root.addRow(8, cancel, submit);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color:BEIGE;");
        root2.setStyle("-fx-background-color:BEIGE;");


         scene1 = new Scene(root, 620, 440);
         scene2 = new Scene(root2, 620, 440);

        window.setScene(scene1);
        window.setTitle("Registration Form");
        window.show();

    }

    public static void main(String[] args) {
        launch();
    }

    public static class stage {
    }
}