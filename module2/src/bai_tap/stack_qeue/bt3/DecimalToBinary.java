package bai_tap.stack_qeue.bt3;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        while(decimal>0){
            int remainder = decimal%2;
            stack.push(remainder);
            decimal/=2;
        }
        String binary = "";
        while(!stack.isEmpty()){
            binary+=stack.pop();
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimalNumber;
        while(true){
            try{
                System.out.println("Enter a decimal number: ");
                decimalNumber = sc.nextInt();
                break;
            }catch(Exception e){
                System.out.println("Invalid input, please enter a valid number.");
                sc.nextLine();
            }
        }
        String binary = decimalToBinary(decimalNumber);
        System.out.println("The binary number is: "+binary);
    }
}
