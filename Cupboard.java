package ООП;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Cupboard {
    int high;
    int width;
    int deep;
    String type;
    String brand;
    Calendar date = new GregorianCalendar(1, 1, 1);

    private Cupboard() {}

    Cupboard(int h, int w, int d, String type, String brand, int year, int month) {
        this.high = h;
        this.width = w;
        this.deep = d;
        this.type = type;
        this.brand = brand;
        this.date.set(Calendar.YEAR,year);
        this.date.set(Calendar.MONTH,month);
    }
    @Override
    public String toString() {
        return this.high + "\n" + this.width + "\n" + this.deep + "\n" + this.type + "\n" + this.brand + "\n" + this.date.get(Calendar.MONTH) + ", " + this.date.get(Calendar.YEAR);
    }

    int volCup() {
        return this.high * this.width * this.deep;
    }

    void setHigh(int h) {
        this.high = h;
    }

    void setWidth(int w) {
        this.width = w;
    }

    void setDeep(int d) {
        this.deep = d;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setType(String type) {
        this.type = type;
    }

    void setDate(int y, int m, int d) {
        this.date.set(Calendar.YEAR,y);
        this.date.set(Calendar.MONTH,m);
        this.date.set(Calendar.DAY_OF_MONTH,d);
    }

    public int getHigh() {return this.high;}
    public int getWidth() {return this.width;}
    public int getDeep() {return this.deep;}
    public String getType() {return this.type;}
    public String getBrand() {return this.brand;}
    public Calendar getDate() {return this.date;}
}
