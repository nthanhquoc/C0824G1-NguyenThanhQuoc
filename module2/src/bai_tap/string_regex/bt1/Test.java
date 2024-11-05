package bai_tap.string_regex.bt1;

import java.util.Scanner;

public class Test {
    private static ClassNameValidator classNameValidator;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên lớp:");
        String nameClass = sc.nextLine();
        classNameValidator = new ClassNameValidator();
        boolean isValid = classNameValidator.validate(nameClass);
        if (isValid) {
            System.out.println("Tên hợp lệ");
        } else {
            System.out.println("Tên không hợp lệ");
        }
    }
}
