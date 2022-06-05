package ООП;

public class Vec2 {
    private static final double MAX_VAL = 128;
    private double a, b;

    public Vec2() {}

    public Vec2 (double a, double b) {
        if (isCorrectMinMax(a) && isCorrectMinMax(b))
        this.a = a;
        this.b = b;
    }

    private boolean isCorrectMinMax (double argsVec) {
        return (argsVec >= -MAX_VAL && argsVec <= MAX_VAL);
    }

    public void setA(double a) {
        if (isCorrectMinMax(a))
        this.a = a;
    }

    public void setB(double b) {
        if (isCorrectMinMax(b))
        this.b = b;
    }

    public double getA() {return a;}

    public double getB() {return b;}


    public Vec2 sum(Vec2 v) {
        Vec2 rez = new Vec2();
        if (isCorrectMinMax((this.a + v.a)) && isCorrectMinMax((this.b + v.b))) {
            rez.a = this.a + v.a;
            rez.b = this.b + v.b;
        } else
            System.out.println("Value is out of range.");
        return rez;
    }

    public Vec2 sub(Vec2 v) {
        Vec2 rez = new Vec2();
        if (isCorrectMinMax((this.a - v.a)) && isCorrectMinMax((this.b - v.b))) {
            rez.a = this.a - v.a;
            rez.b = this.b - v.b;
        } else
            System.out.println("Value is out of range.");
        return rez;
    }

}
