package ООП;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.FEBRUARY;
import static java.util.Calendar.YEAR;

public class Book {
   /* public static void main (String[] args) {
        Book iJ= new Book();
        System.out.println(dateNow.getTime());
    }
*/
        private static final int MAX_PAGES = 10000;
        private String name;
        private String author;
        private String date;
        private int pages;
        private int year;
        private int month;

        private Calendar dateNow = new GregorianCalendar();
        private Calendar date1 = new GregorianCalendar(year, month, 1);

        Book() {}

        public Book(String name, String author, int year, int month, int pages) {
            this.name = name;
            this.author = author;
            this.date = date;
            this.pages = pages;
            if (isDateCorrect(date1, dateNow)) {
                this.date1.set(Calendar.YEAR, year);
                this.date1.set(Calendar.MONTH, month);
            } else
                System.out.println("This book has not been published yet");
        }

    @Override
    public String toString() {
        return this.author + "\n" + this.name+ "\n" + this.date1.get(YEAR) + ", " + this.date1.get(Calendar.MONTH) + "." + "\n" + this.pages;
    }

    private boolean isDateCorrect(Calendar d1, Calendar d2){
        return (d1.before(d2));
    }

    void setDate (int year, int month){
        this.year = year;
        this.month = month;
        date1.set(Calendar.YEAR, year);
        date1.set(Calendar.MONTH, month);
        if (isDateCorrect(date1, dateNow))
            this.date = Integer.toString(date1.get(Calendar.MONTH)) + ", " + (date1.get(YEAR)) + ".";
        else
            this.date = "This book has not been published yet.";
    }


    private boolean isAuthorCorrect(String author){
        int count = 0;
        for (int i = 0; i < author.length(); i++ ) {
            if (!Character.isLetter(author.charAt(i)) || author.charAt(i) != ' ' || author.charAt(i) != '-' || author.charAt(i) != '.')
                count++;
        }
        if (count > 0) {
            System.out.println("Unavailable author");
            return false;

        }else
            return true;
    }

    void setAuthor (String author){
            if (isAuthorCorrect(author))
                this.author = author;
    }

    private boolean isNameCorrect(String name){
        int count = 0;
        for (int i = 0; i < name.length(); i++){
            if (!Character.isLetter(name.charAt(i)) || name.charAt(i) != '.' ||
                    name.charAt(i) != '-' || name.charAt(i) != ',' || name.charAt(i) != '!'
                    || name.charAt(i) != '?')
            count++;
        }
        if (count > 0) {
            System.out.println("Unavailable name.");
            return false;
        } else
            return true;

    }

    void setName (String name){
            //if (isNameCorrect(name))
                this.name = name;
    }

    private boolean isPagesCorrect(int pages){
            return (0 < pages && pages < MAX_PAGES);
    }

    void setPages (int pages){
            if (isPagesCorrect(pages))
                this.pages = pages;
    }

    public String getName() {return name;}
    public String getAuthor() {return author;}
    public String getDate() {return  date;}
    public int getPages() {return pages;}


}
