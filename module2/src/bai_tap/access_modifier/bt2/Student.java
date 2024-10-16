package bai_tap.access_modifier.bt2;

public class Student {
    private String name;
    private String classes;
    public Student(){
        this.name = "John";
        this.classes = "C02";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }

}
