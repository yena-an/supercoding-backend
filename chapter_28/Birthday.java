package ClassAndObject.chapter_28;

public class Birthday {
    private int year;
    private int month;
    private int day;

    public void setyear(int year){
        this.year = year; // set year의 year = 위의 private int year
    }

    private void printHi(){
        System.out.println("Hi");
    }

    Birthday(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
        this.printHi();
    }
}
