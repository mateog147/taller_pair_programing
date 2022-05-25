package com.sofka.calculator;

import java.util.logging.Logger;

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
