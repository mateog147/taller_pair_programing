package com.sofka.calculator;

import java.util.Scanner;
import java.util.logging.Level;
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
        logger.info("Seleccione la operación deseada:\n1.Suma\n2.Resta\n3.Multiplicación\n4.División");
        operator = values.nextInt();
        executeOperation();
    }

    private void executeOperation(){
        switch (operator) {
            case 1 -> this.addition();
            case 2 -> this.subtraction();
            case 3 -> this.multiplication();
            case 4 -> this.division();
            default -> logger.warning("Opción no valida.");
        }
    }

    private void addition(){
        result = numberA + numberB;
    }

    private void subtraction(){
        result = numberA - numberB;
    }

    private void multiplication(){
        result = numberA * numberB;
    }

    private void division(){
        result = numberA / numberB;
    }

    public void printResult(){
        try{
            logger.log(Level.INFO,"El resultado es {0}", result);
        }catch(ArithmeticException e) {
            logger.log(Level.WARNING,"Error en el resultado");
        }
    }
}
