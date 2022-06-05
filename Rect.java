package ООП;

public class Rect {
    static int x1;
    static int x2;
    static int y1;
    static int y2;

    Rect() {

    }

    Rect(int x1, int y2) {
        Rect.x1 = x1;
        Rect.y2 = y2;

    }

    static {
        x1 = 25;
        x2 = 25;
        y1 = 25;
        y2 = 25;
    }

    public static int getX1() {
        return x1;
    }

    public static int getY1() {
        return y1;
    }

    public static void setX1(int x1) {
        Rect.x1 = x1;
    }

    public static int getX2() {
        return x2;
    }

    public static void setX2(int x2) {
        Rect.x2 = x2;
    }

    public static int highRect(Rect st){
          return x2 - x1;
    }

    public static int widthRect(Rect nd){
        return y2 - y1;
    }


}
