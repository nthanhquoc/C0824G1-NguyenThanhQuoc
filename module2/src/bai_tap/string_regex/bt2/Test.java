package bai_tap.string_regex.bt2;



import java.util.Scanner;

public class Test {
    private static PhoneValidator phoneValidator;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valid phone numbers is: (xx)-(0xxxxxxxxx)");
        String nameClass = sc.nextLine();
        phoneValidator = new PhoneValidator();
        boolean isValid = phoneValidator.validate(nameClass);
        if (isValid) {
            System.out.println("Tên hợp lệ");
        } else {
            System.out.println("Tên không hợp lệ");
        }
    }
}
