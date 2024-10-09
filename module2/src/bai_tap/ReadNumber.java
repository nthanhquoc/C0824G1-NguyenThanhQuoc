package bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Vao 1 So");
        int number = sc.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (number < 20) {
            switch (number) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number < 100) {
            int ten = number / 10;
            int eleven = number % 10;
            switch (ten) {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Forty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eighty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            if (eleven != 0) {
                System.out.print(" ");
                switch (eleven) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }
        } else if (number < 1000) {
            int hundred = number / 100;
            int tenHundred = number % 100;
            switch (hundred) {
                case 1:
                    System.out.print("One hundred");
                    break;
                case 2:
                    System.out.print("Two hundred");
                    break;
                case 3:
                    System.out.print("Three hundred");
                    break;
                case 4:
                    System.out.print("Four hundred");
                    break;
                case 5:
                    System.out.print("Five hundred");
                    break;
                case 6:
                    System.out.print("Six hundred");
                    break;
                case 7:
                    System.out.print("Seven hundred");
                    break;
                case 8:
                    System.out.print("Eight hundred");
                    break;
                case 9:
                    System.out.print("Nine hundred");
                    break;
            }
            if (tenHundred != 0) {
                System.out.print(" ");
                if (tenHundred < 10) {
                    switch (tenHundred) {
                        case 1:
                            System.out.print("Zero One");
                            break;
                        case 2:
                            System.out.println("Zero Two");
                            break;
                        case 3:
                            System.out.print("Zero Three");
                            break;
                        case 4:
                            System.out.print("Zero Four");
                            break;
                        case 5:
                            System.out.print("Zero Five");
                            break;
                        case 6:
                            System.out.print("Zero Six");
                            break;
                        case 7:
                            System.out.print("Zero Seven");
                            break;
                        case 8:
                            System.out.print("Zero Eight");
                            break;
                        case 9:
                            System.out.print("Zero Nine");
                            break;
                    }
                } else if (tenHundred < 20) {
                    switch (tenHundred) {
                        case 10:
                            System.out.print("Ten");
                            break;
                        case 11:
                            System.out.print("Eleven");
                            break;
                        case 12:
                            System.out.print("Twelve");
                            break;
                        case 13:
                            System.out.print("Thirteen");
                            break;
                        case 14:
                            System.out.print("Fourteen");
                            break;
                        case 15:
                            System.out.print("Fifteen");
                            break;
                        case 16:
                            System.out.print("Sixteen");
                            break;
                        case 17:
                            System.out.print("Seventeen");
                            break;
                        case 18:
                            System.out.print("Eighteen");
                            break;
                        case 19:
                            System.out.print("Nineteen");
                            break;
                    }
                } else {
                    int tens = tenHundred / 10;
                    int ones = tenHundred % 10;
                    switch (tens) {
                        case 2:
                            System.out.print("Twenty");
                            break;
                        case 3:
                            System.out.print("Thirty");
                            break;
                        case 4:
                            System.out.print("Forty");
                            break;
                        case 5:
                            System.out.print("Fifty");
                            break;
                        case 6:
                            System.out.print("Sixty");
                            break;
                        case 7:
                            System.out.print("Seventy");
                            break;
                        case 8:
                            System.out.print("Eighty");
                            break;
                        case 9:
                            System.out.print("Ninety");
                            break;
                    }
                    if (ones != 0) {
                        System.out.print(" ");
                        switch (ones) {
                            case 1:
                                System.out.print("One");
                                break;
                            case 2:
                                System.out.print("Two");
                                break;
                            case 3:
                                System.out.print("Three");
                                break;
                            case 4:
                                System.out.print("Four");
                                break;
                            case 5:
                                System.out.print("Five");
                                break;
                            case 6:
                                System.out.print("Six");
                                break;
                            case 7:
                                System.out.print("Seven");
                                break;
                            case 8:
                                System.out.print("Eight");
                                break;
                            case 9:
                                System.out.print("Nine");
                                break;
                        }
                    }
                }
            }
        }
        else{
            System.out.println("out of ability");

        }
    }

}
