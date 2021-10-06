package Task1;

public class Car {
    private String Make;
    private String Model;
    private int Year;
    private String BodyStyle;
    private Driver driver;


    public Car(String _Make, String _Model, int _Year, String _BodyStyle) {
        this.Make = _Make;
        this.Model = _Model;
        this.Year = _Year;
        this.BodyStyle = _BodyStyle;

    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver d1) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", Year=" + Year +
                ", BodyStyle='" + BodyStyle + '\'' +
                '}';
    }

}
