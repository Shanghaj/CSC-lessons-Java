package ООП;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Arrays;
class Library {


   static final int MAX_BOOKS = 5;
   public static void main(String[] args) {
       Book lor = new Book("'Lord of the Rings'", "R.R. Tolkien", 2020, 12, 700);

       Book hP = new Book();
       hP.setName("'Harry Potter'");
       hP.setAuthor("J. Rouling");
       hP.setDate(2010, 10);
       hP.setPages(730);

       Book[] lib = new Book[MAX_BOOKS];
       lib[0] = lor;
       lib[4] = hP;

       System.out.println();
       System.out.println(lib[0].toString() + "\n");
       System.out.println(lib[4].toString());

   }
}
