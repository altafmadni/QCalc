/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        StandardCalculator calc = new StandardCalculator();
        calc.add(1, 1);
        calc.printResult();
        calc.subtract(1, 1);
        calc.printResult();
        calc.multiply(1,1);
        calc.printResult();
        calc.divide(1, 1);
        calc.printResult();
        calc.clear();


    }
}
