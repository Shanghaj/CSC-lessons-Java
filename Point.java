package ООП;

public class Point {
    public int x;
    public int y;
    public int color;

    public void print(){
        System.out.println("Цвет точки x=" + x + ", y=" + y + " " + color);
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setColor(int color){
        this.color = color;
    }
}
