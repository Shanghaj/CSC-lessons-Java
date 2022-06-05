package ООП;

public class ShopItem {
    static int id;
    String name;
    int high;
    int width;
    int length;
    double weight;
    double price;
    int count;

    static {
        id = 0;
    }

    ShopItem() {
        this.id++;
        this.count = id;
    }

    ShopItem(String sKu, int h, int w, int l, double weight, double $) {
        this.id++;
        this.count = id;
        this.name = sKu;
        this.high = h;
        this.width = w;
        this.length = l;
        this.price = $;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "id: " + this.count + "\nname: " + this.name + "\ndimensions: " + (this.high * this.width * this.length)
                + "\nweight: " + this.weight + "\nPrice: " + this.price + " $";
    }

    void setHigh(int high) {
        this.high = high;
    }

    public int getHigh() {return this.high;}

    void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {return this.width;}

    void setLength(int length) {
        this.length= length;
    }

    public int getLength() {return this.length;}

    void setName(String name) {
        this.name = name;
    }

    public String getName() {return this.name;}

    void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {return this.weight;}

    void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {return this.price;}

}
