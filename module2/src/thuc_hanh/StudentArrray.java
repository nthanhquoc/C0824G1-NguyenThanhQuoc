package thuc_hanh;

import java.util.Scanner;

public class StudentArrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExist = false;
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        for(int i=0;i<students.length;i++){
            if(students[i].equals(name)){
                System.out.println("Student"+name+" in "+i+" is exist");
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Not Found"+name+" in "+students.length+" students");
        }
    }
}
