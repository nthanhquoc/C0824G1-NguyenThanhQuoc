package thuc_hanh.exception;

import java.util.Scanner;

public class CaculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay Nhap x: ");
        int x = sc.nextInt();
        System.out.println("Hay Nhap y: ");
        int y = sc.nextInt();
        CaculationExample calc=new CaculationExample();
        calc.calculate(x,y);
    }
    public void calculate(int x,int y){
        try{
            int a=x+y;
            int b=x-y;
            int c=x*y;
            int d=x/y;
            System.out.println("Tong x + y = "+a);
            System.out.println("Hieu x - y = "+b);
            System.out.println("Tich x * y = "+c);
            System.out.println("Thuong x / y ="+d);
        } catch (Exception e) {
            System.err.println("Xay Ra ngoai le "+e.getMessage());
        }
    }
}
