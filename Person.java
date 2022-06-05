package ООП;
import java.lang.Integer;
import java.lang.String;

public class Person {
    private String name;
    private int age;
    private int qual;
    private double weight;

    Person(){}

    Person (String name, int age, double weight, int qual){
        this.name = name;
        this.age = age;
        this.qual = qual;
        this.weight = weight;
    }
    private boolean isCorrectName(String argName) {
        int count = 0;
        for (int i = 0; i < argName.length(); i++) {
            if (!Character.isLetter(argName.charAt(i)) && (argName.charAt(i) != ' ') && (argName.charAt(i) != '-'))
                count++;
        }
            if (count > 0)
                return false;
            else
                return true;


    }
    void setName (String name){
        if (isCorrectName(name))
        this.name = name;
    }

    private boolean isCorrectAge(int argAge){
        return (30 <= argAge && argAge <= 200);
    }
    void setAge(int age){
        if (isCorrectAge(age))
        this.age = age;
    }

    private boolean isCorrectQual(int argQual){
        return(argQual >= 1 && argQual <= 5);
    }
    void setQual(int qual) {
        if (isCorrectQual(qual))
        this.qual = qual;
    }

    private boolean isCorrectWeight(double argWeight){
        return (argWeight >= 30 && argWeight <= 200);
    }
    void setWeight(double weight){
        if (isCorrectWeight(weight))
        this.weight = weight;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getQual() {return qual;}
    public double getWeight() {return weight;}

}
