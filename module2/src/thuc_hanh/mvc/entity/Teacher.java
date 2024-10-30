package thuc_hanh.mvc.entity;

public class Teacher extends Person{
    private String exp;
    public Teacher(){

    }
    public Teacher(int id,String name,String address,String exp){
        super(id,name,address);
        this.exp=exp;
    }
    public double getExp(){
        return Double.parseDouble(exp);

    }
    public void setExp(String exp){
        this.exp=exp;
    }
    @Override
    public String toString() {
        return String.format(
                "┌────────────┬────────────────┬─────────────────────┬───────┐%n" +
                        "│    ID      │      Name      │      Address        │  Exp  │%n" +
                        "├────────────┼────────────────┼─────────────────────┼───────┤%n" +
                        "│ %-10s │ %-14s │ %-19s │ %-5s │%n" +
                        "└────────────┴────────────────┴─────────────────────┴───────┘",
                super.getCode(), super.getName(), super.getAddress(), getExp()
        );
    }
}
