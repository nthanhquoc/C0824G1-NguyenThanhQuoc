package thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter the third number: ");
        double c = sc.nextDouble();
        if(a!=0){
            double answer= (c-b)/a;
            System.out.printf("Equation pass with x= %f!\n",answer);
        }else{
            if(b==c){
                System.out.print("The solution is all x!");
            }else{
                System.out.print("No solution!");
            }
        }
    }
}
