package edu.masanz.da.juegored.util;

import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class Validator {

    public static boolean hashText(TextField txtField) {
        String texto = txtField.getText();
        if(texto == null || texto.isEmpty()){
            return false;
        }
        return true;
    }

    public static boolean hashNumber(Spinner<Integer> spnNumero) {

        if(spnNumero.getValue() != null && spnNumero.getValue() instanceof Integer && (int)spnNumero.getValue() > 0){
            return true;
        }
        return false;
    }
}
