package ООП;

import Syntaxis.Chair;

public class Main {
    public static void main(String[] args) {
       /* Person emp1 = new Person("Шангин Александр Николаевич", 32, 61, 5);


        Person emp2 = new Person();
        emp2.setName("Robiert Kisiel-Stray");
        emp2.setAge(42);
        emp2.setWeight(83.4);
        emp2.setQual(5);
        System.out.println(emp1.getName() + "\nAge: " + emp1.getAge() + ";\nWeight: " + emp1.getWeight() +
                "; \nQualification: " + emp1.getQual() + ";\n");
        System.out.println(emp2.getName() + "\nAge: " + emp2.getAge() + ";\nWeight: " + emp2.getWeight() +
                "; \nQualification: " + emp2.getQual() + ";\n");

        */

    /*Vec2 ab = new Vec2(325, 4);

    Vec2 a2b2 = new Vec2();
    a2b2.setA(25);
    a2b2.setB(17);


        System.out.println("Vector ab: aX = " + ab.getA() + "; aY = " + ab.getB() + ";");
        System.out.println("Vector a2b2: aX = " + a2b2.getA() + "; aY = " + a2b2.getB() + ";");
        Vec2 obj = a2b2.sum(ab);
        System.out.println("New vector after summation is a = " + obj.getA() + "; b = " + obj.getB() + ";");
        Vec2 objSub = ab.sub(a2b2);
        System.out.println("New vector after subtraction is a = " + objSub.getA() + "; b = " + objSub.getB() + ";");
        System.out.println(ab.sum(obj).sub(ab).getB());
*/

    TV samsung = new TV("Samsung", 524.44);
    TV lG = new  TV(57, 584.44);
       // System.out.println(samsung.toString());
       // System.out.println(lG);

    Cupboard kashmir = new Cupboard(250, 300, 60, "cupe", "Wojcik",  2020, 2);
        int logistic = kashmir.volCup();
       // System.out.println(logistic + "\nвысота: " + kashmir.getHigh() + "\nширина: " + kashmir.getWidth() + "\nглубина: " + kashmir.getDeep());
       // System.out.println(kashmir.toString());



    Book hP = new Book("Harry Potter", "Joan Rouling", 2023, 10,780);
        //System.out.println(hP.toString());

    Chair chDl = new Chair();
    chDl.setHigh(85);
    chDl.setWidth(45);
    chDl.setDeep(43);
        //System.out.println("высота: " + chDl.getHigh() + "\nширина: " + chDl.getWidth() + "\nглубина: " + chDl.getDeep()
          //      + "\nлогистический объём: " + chDl.volChair());

    Chair arizona = new Chair(90, 43, 44, 350, "DesignPort", 2022,11);
        //System.out.println(arizona.toString());

    ShopItem apple = new ShopItem("apple", 10, 12, 8, 0.250,7.3);
    ShopItem rocket = new ShopItem("weapon", 2, 7, 3, 1.530,11999.99);
    ShopItem music = new ShopItem();
    music.setName("Pat Matheny");
       /* System.out.println(apple.toString());
        System.out.println(rocket);
        System.out.println(music.toString());*/


    Rect small = new Rect();
    Rect.setX1(12);
    Rect.setX2(10);
    Rect big = new Rect(4,17);



        System.out.println(Rect.getX1());
        System.out.println(Rect.highRect(small));
        System.out.println(Rect.getY1());

    }



}
