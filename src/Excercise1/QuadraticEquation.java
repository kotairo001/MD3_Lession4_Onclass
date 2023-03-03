package Excercise1;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    ;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getA(double a) {
        this.a = a;
    }

    public void getB(double b) {
        this.b = b;
    }

    public void getC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1 = 0;
        if (getDiscriminant() >= 0) {
            r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
        }
        return r1;
    }

    public double getRoot2() {
        double r2 = 0;
        if (getDiscriminant() >= 0) {
            r2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
        }
        return r2;
    }
}

