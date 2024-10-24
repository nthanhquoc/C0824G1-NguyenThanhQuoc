package bai_tap.stack_qeue.bt4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        char arc;
        str = str.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            arc = str.charAt(i);
            stack.push(arc);
            queue.add(arc);
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Nhap Chuoi Can Check: ");
        str = sc.nextLine();
        display(str);
    }

    private static void display(String str) {
        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" là chuỗi Palindrome.");
        } else {
            System.out.println("\"" + str + "\" không phải là chuỗi Palindrome.");
        }
    }
}
