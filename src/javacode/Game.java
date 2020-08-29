package javacode;

public class Game {
    private String name;
    private String manufacturer;
    private String year;


    public Game(String name, String manufacturer, String year) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
