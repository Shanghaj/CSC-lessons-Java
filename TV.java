package ООП;


public class TV {
    private String brand;
    private int diagonal;
    private int year;
    private double price;

    {
        brand = "LG";
        diagonal = 51;
        year = 2020;
        price = 1000;
    }

    private TV() {
        this.brand = "LG";
        this.diagonal = 51;
        this.year = 2020;
        this.price = 1000;
    }

    TV(String brand, double price) {
        this.brand = brand;
        this.price = price;

    }

    TV(int diagonal, double price) {
        this.diagonal = diagonal;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.brand + "\n" + this.diagonal + "\n" + this.year + "\n" + this.price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {return brand;}
    public int getYear() {return year;}
    public int getDiagonal() {return diagonal;}
    public double getPrice() {return price;}
}
