package br.com.unipar;

import br.com.unipar.entities.ScientificCalculator;

public class Main {

    public static void main(String[] args) {
        
        ScientificCalculator calculator = new ScientificCalculator();
        
        System.out.println(calculator.sum(10, 5));
        System.out.println(calculator.subtraction(20, 3));
        System.out.println(calculator.division(5, 2));
        System.out.println(calculator.multiplication(2, 50));
        System.out.println(calculator.squareRoot(9));
        System.out.println(calculator.potency(5, 3));
    }
    
}
