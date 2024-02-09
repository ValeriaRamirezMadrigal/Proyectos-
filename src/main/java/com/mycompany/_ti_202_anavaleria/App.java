package com.mycompany._ti_202_anavaleria;

import java.util.function.Function;
public class App {
    private final Function<Double, Double> function;

    public App(Function<Double, Double> function) {
        this.function = function;
    }
    public void evaluate(double start, double end) {
        for (double x = start; x <= end; x += 0.1) {
            double result = function.apply(x);
            System.out.println("f(" + x + ") = " + result);
        }
    }
    public static void main(String[] args) {
        //rango [0, 5]
        Function<Double, Double> squareFunction = x -> x * x;
        App evaluator = new App(squareFunction);
        evaluator.evaluate(0, 5);//aqui es el rango
    }
} 

