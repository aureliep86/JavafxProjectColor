package aurelie.controller;

import aurelie.model.Color;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.text.MaskFormatter;
import java.net.URL;
import java.util.ResourceBundle;

public class ColorController implements Initializable {

    /*private int red;
    private int green;
    private int blue;
    private char[] tabChar;*/

    private Color color;

    @FXML
    private Slider sliderRed;

    @FXML
    private TextField textFieldRed;

    @FXML
    private Slider sliderGreen;

    @FXML
    private TextField textFieldGreen;

    @FXML
    private Slider sliderBlue;

    @FXML
    private TextField textFieldBlue;

    @FXML
    private TextField textFieldHex;

    @FXML
    private TextArea textAreaColor;

    @FXML
    private TextArea textAreaColor1;

    @FXML
    private TextArea textAreaColor2;

    @FXML
    private TextArea textAreaColor3;

    @FXML
    private TextArea textAreaColor4;

    @FXML
    private TextArea textAreaColor5;

    public void miseAJourSlider(Slider slider, TextField textField) {
        slider.setOnMouseClicked(value -> {
            textField.setText(String.format("%.0f", slider.getValue()));
            Color color = new Color((int)sliderRed.getValue(), (int)sliderGreen.getValue(), (int)sliderBlue.getValue());
            textFieldHex.setText(color.getHexValue());
            textAreaColor.setStyle("-fx-control-inner-background: "+color.getHexValue());
        });
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        /*sliderRed.setOnMouseClicked(value -> {
            sliderRed.getValue();
            textFieldRed.setText(String.format("%.0f", sliderRed.getValue()));
            Color color = new Color((int)sliderRed.getValue(), (int)sliderGreen.getValue(), (int)sliderBlue.getValue());
            textFieldHex.setText(color.getHexValue());
            textAreaColor.setStyle("-fx-control-inner-background: "+color.getHexValue());
        });

        sliderGreen.setOnMouseClicked(value -> {
            sliderGreen.getValue();
            textFieldGreen.setText(String.format("%.0f", sliderGreen.getValue()));
            Color color = new Color((int)sliderRed.getValue(), (int)sliderGreen.getValue(), (int)sliderBlue.getValue());
            textFieldHex.setText(color.getHexValue());
            textAreaColor.setStyle("-fx-control-inner-background: "+color.getHexValue());
        });

        sliderBlue.setOnMouseClicked(value -> {
            sliderBlue.getValue();
            textFieldBlue.setText(String.format("%.0f", sliderBlue.getValue()));
            Color color = new Color((int)sliderRed.getValue(), (int)sliderGreen.getValue(), (int)sliderBlue.getValue());
            textFieldHex.setText(color.getHexValue());
            textAreaColor.setStyle("-fx-control-inner-background: "+color.getHexValue());
        });*/

        miseAJourSlider(sliderRed, textFieldRed);
        miseAJourSlider(sliderGreen, textFieldGreen);
        miseAJourSlider(sliderBlue, textFieldBlue);

    }
}
