package com.ac.date;
import java.util.Calendar;

public class Date {
    protected int day=1, month=1, year = 2000;
    protected String mName;


    public Date(int day, int month, int year){
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public Date(){
        Calendar c = Calendar.getInstance();
        setDay(c.get(Calendar.DAY_OF_MONTH));
        setMonth(c.get(Calendar.MONTH));
        setYear(c.get(Calendar.YEAR));
    }
    public static boolean isLeap (int year){
        if((year%4 == 0 && year%100 != 0) ||
           (year%4 == 0 && year%400 == 0)) {return true;}
        return false;
    }

    public boolean isLeap (){
        if((year%4 == 0 && year%100 != 0)||
           (year%4 == 0 && year%400 == 0)) {return true;}
        return false;
    }

    public void setYear(int year){
        this.year = (year >= 1900 && year <= 3000) ? year : this.year;
    }

    public void setMonth(int month){
        this.month = (month >= 1 && month <= 12) ? month : this.month;
    }

    public void setDay(int day){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                this.day = (day >= 1 && day <= 31) ? day : this.day;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                this.day = (day >= 1 && day <= 30) ? day : this.day;
                break;

            case 2:
                this.day = (day >= 1 && day <= 29) ? day : this.day;
                break;
        }
    }

    public void setmName (String mName){
        this.mName = mName;
    }

    public int getDay (){ return day; }
    public int getMonth (){ return month; }
    public int getYear () { return year; }
    public String getmName () { return mName; }
}
