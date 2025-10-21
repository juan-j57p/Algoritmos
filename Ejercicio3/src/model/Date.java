package model;

public class Date {
    private int  day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int calculateYears(Date dateNow) {
        int age = 0;
        age = dateNow.getYear() - this.year;
        return age;
    }

    public int calculateSemesters(Date dateNow) {
        int semesters = 0;
        semesters = (dateNow.getYear() - this.year) * 2;
        return semesters;
    }
}