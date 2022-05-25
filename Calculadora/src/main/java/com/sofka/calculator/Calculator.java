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

    public Calculator(Scanner values) {
        this.values = new Scanner(System.in);
    }

    public void inputNumber() {
        logger.info("Ingrese el primer número: ");
        numberA = values.nextDouble();
        logger.info("Ingrese el segundo número: ");
        numberB = values.nextDouble();
    }
}
