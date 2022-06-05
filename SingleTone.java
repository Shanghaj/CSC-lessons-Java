package ООП;
import java.util.Scanner;
public class SingleTone {

     public static void main(String[] args) {
         Object object = new Object();
         Object object1 = new Object();
         int hCode = object.hashCode();
         int hCode1 = object1.hashCode();
         System.out.println(hCode + "\n" + hCode1);
     }



}
