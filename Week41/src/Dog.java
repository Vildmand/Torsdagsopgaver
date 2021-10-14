import java.util.ArrayList;

public class Dog {
    private Owner owner;
    private final String name;
    private final boolean isHungry;
    ArrayList<String> offSpring = new ArrayList<>();

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    boolean feedDog(){
        if (isHungry == true){
        }
        return false;
    }

    void setOwner(String Owner) {
    }


    public ArrayList<String> getOffSpring() {
        return offSpring;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOffSpring(String Mydog) {
        offSpring.add(Mydog);
    }
}