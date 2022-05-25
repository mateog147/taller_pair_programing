package com.sofka.calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    private double numberA;
    private double numberB;
    private int operator;
    private double result;
    Logger logger = Logger.getLogger("logger");
    private final Scanner values;

    public Calculator() {
        this.values = new Scanner(System.in);
    }

    public void inputNumber() {
        logger.info("Ingrese el primer número: ");
        numberA = values.nextDouble();
        logger.info("Ingrese el segundo número: ");
        numberB = values.nextDouble();
    }

    public  void selectOperator(){
        logger.info("Seleccione la operación deseasda:\n1. Suma\n2.Resta\n3.Multiplicación\n4.División");
        operator = values.nextInt();
    }

    private void executeOperation(){
        switch(operator){
            case 1: this.addition();
                break;

            case 2: this.subtract();
                break;

            case 3: this.multiplication();
                break;

            case 4: this.division();
                break;

            default:
                logger.warning("Opción no valida.");

        }
    }


}
