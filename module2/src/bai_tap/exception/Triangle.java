    package bai_tap.exception;

    import java.util.Scanner;

    public class Triangle {
        public static void validTriangle(double a, double b, double c) throws IllegalTriangleException  {
            if(a<=0||b<=0||c<=0) {
                throw new IllegalTriangleException("The sides of the triangle are non-negative or equal to 0");
            }
            else if(a+b<=c||b+c<=a||a+c<=b){
                throw new IllegalTriangleException("The Sum of Two sides must be greater than the remaining side");
            }
        }

        public static void main(String[] args) {
            double sideOne;
            double sideTwo;
            double sideThree;
            Scanner sc=new Scanner(System.in);
            while(true) {
                sideOne=inputSide(sc,"A");
                sideTwo=inputSide(sc,"B");
                sideThree=inputSide(sc,"C");
                try{
                    validTriangle(sideOne,sideTwo,sideThree);
                    System.out.println("Valid Triangle");
                    break;
                }catch (IllegalTriangleException e){
                    System.err.println("Error: "+e.getMessage());
                    System.out.println("Please enter the sides of the triangle");
                }
            }
        }
        public static double inputSide(Scanner sc,String str){
            double side;
            while (true){
                try{
                    System.out.println("Enter side "+str+": ");
                    side=sc.nextDouble();
                    if(side<0){
                        throw new IllegalTriangleException("Side must be positive");
                    }
                    return side;
                } catch (Exception e) {
                    System.err.println("Invalid Input");
                    sc.nextLine();
                }
            }
        }
    }
