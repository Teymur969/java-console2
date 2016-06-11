package logic;

public class Car {

    private String manufacturer;
    private String model;
    private Integer year;

    private Car() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void print() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    private static Integer count = 0;

    public static Car create() {
        Car.count = Car.count + 1;
        return new Car();
    }

    public static Integer getCount() {
        return Car.count;
    }

}
