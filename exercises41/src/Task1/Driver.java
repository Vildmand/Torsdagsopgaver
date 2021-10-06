package Task1;

public class Driver {
    String name;
    int age;

    public Driver(String _name, int _age) {
        this.name =_name;
        this.age =_age;
    }

    @Override
    public String toString() {
        return "Is driven by{" +
                name + '\'' +
                '}';
    }

}