package thuc_hanh.abstract_interface.bt1;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck";
    }
    @Override
    public String howtoEat(){
        return "Could be fried";
    }

}
