package ch.juventus.javadoc;

import java.util.List;

public class MathUtils2 {

    public double addition(List<Double> numbers){
       double sum = 0;

       for (double number: numbers){
           sum = sum + number;
       }

       return sum;

    }

    public double subtraction(double a, double b){
        return a - b;
    }

    public double division(double a, double b){
        return a / b;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

}
