package bai_tap.method;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char characterInString;
        System.out.println("Input string: ");
        str = sc.nextLine();
        System.out.println("Input Character: ");
        characterInString = sc.next().charAt(0);
        System.out.println(str);
        System.out.println(characterInString);
        System.out.println("The number of character "+characterInString+"in the String is "+countChar(str,characterInString));
    }
    public static int countChar(String str, char character) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}
