public class Car {
    private String make;
    private String model;
    private short year;
    private byte cylinders;
    private String powerSource;

    public Car() {}

    public Car(String make, String model, short year, byte cylinders, String powerSource) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.cylinders = cylinders;
        this.powerSource = powerSource;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public byte getCylinders() {
        return cylinders;
    }

    public void setCylinders(byte cylinders) {
        this.cylinders = cylinders;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
}
