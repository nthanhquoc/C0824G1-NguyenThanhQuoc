package thuc_hanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=sc.nextInt();
        if(number<2){
            System.out.println("Not Prime Number");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not Prime Number");
            }
        }
    }
}
