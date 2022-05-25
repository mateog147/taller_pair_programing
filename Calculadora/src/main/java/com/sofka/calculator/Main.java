package com.sofka.calculator;

import java.util.logging.Logger;

/**
 * Clase principal donde se ejecuta la calculadora
 * Se crea una instancia de clase calculadora y se invocan los métodos para la operación seleccionada
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/22
 * @since 1.0.0
 */

public class Main {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            calculator.inputNumber();
            calculator.selectOperator();
            calculator.printResult();
        }catch (Exception e){
            Logger errorLogger = Logger.getLogger("errorLogger");
            errorLogger.warning("Error en la operación");
        }
    }
}
