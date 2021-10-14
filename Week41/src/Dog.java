public class Dog {

    String name;
    boolean isHungry;
    private String OffSpring;
    private String owner;

    public Dog(String _name, boolean _isHungry) {
        this.name = _name;
        this.isHungry = _isHungry;
    }

    public boolean feedDog() {
        if (isHungry == true) {
            isHungry = false;
            System.out.println("The Dog is not hungry");
        }
        return false;
    }

    public String getOffSpring() {
        return OffSpring;
    }

    public void setOffSpring(String _OffSpringName) {
        this.OffSpring = _OffSpringName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
