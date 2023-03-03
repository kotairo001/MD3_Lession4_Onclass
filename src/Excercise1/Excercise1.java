package Excercise1;

import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number");
        double a = scanner.nextDouble();
        System.out.println("Input the second number");
        double b = scanner.nextDouble();
        System.out.println("Input the thirst number");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta is " + delta);

        if(delta>0){
            System.out.println("Root number 1 is " + quadraticEquation.getRoot1());
            System.out.println("Root number 2 is " + quadraticEquation.getRoot2());
        } else if (delta==0) {
            System.out.println("Root is " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

}
