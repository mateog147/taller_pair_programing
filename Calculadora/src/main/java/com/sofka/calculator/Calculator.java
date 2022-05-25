package com.sofka.calculator;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Calculadora.
 *
 * Contiene los metodos necesarios para efectuar sobre dos numeros las 4 operaciones basicas.
 * - Suma.
 * - Resta.
 * - Multiplicación.
 * - División.
 *
 * @author Mateo Gutierrez <mateog147@hotmail.com>
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022/05/22
 * @since 1.0.0
 */
public class Calculator {
    /**
     * Primer numero  de la operación, en caso de la division es el dividendo:
     */
    private double numberA;
    /**
     * Segundo numero  de la operación, en caso de la division es el divisor.
     */
    private double numberB;
    /**
     * Indentificador de la operación a ejecutar, entre 1 y 4.
     */
    private int operator;
    /**
     * Resultado de efectuar la operación seleccionada para los dos numeros ingresados:
     */
    private double result;
    /**
     * Instancia de la clase loger, para registrar mensajes en consola
     */
    private final Logger logger = Logger.getLogger("logger");
    /**
     * Instancia de la clase Scanner para capturar valores por teclado.
     */
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
