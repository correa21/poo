package com.ac.date;
import java.util.Calendar;

class DateTime extends Date {
    private int seconds = 0, minutes = 0, hours = 0;

    public DateTime(){
        super();
        Calendar c = Calendar.getInstance();
        setHour(c.get(Calendar.HOUR));
        setMinutes(c.get(Calendar.MINUTE));
        setSeconds(c.get(Calendar.SECOND));

    }
    public void setHour(int hh){
        if (hh <= 23 && hh >= 0) {this.hours = hh;}
    }
    public void setMinutes(int mi){
        if (mi <= 59 && mi >= 0) {this.minutes = mi;}
    }
    public void setSeconds(int sec){
        if (sec <= 59 && sec >= 0) {this.seconds = sec;}
    }
}
