

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Vector;

import iteso.calendar.Date;
import iteso.calendar.DateTime;


public class App {
    public static void main(String[] args) throws Exception {

        Date d1 = new Date(1862, 5, 5);
        HashMap<String, Date> importantDates = new HashMap<>();
        importantDates.put("Batalla Puebla", d1);

        importantDates.put("Esta Navidad", new Date(2017, 12, 25));
        importantDates.put("Independencia", new Date(1810, 9, 16));

        System.out.println(importantDates);

        importantDates.remove("Batalla Puebla");
        Date v = importantDates.get("Esta Navidad");

        System.out.println(importantDates);
        System.out.println(v);

        Set<String> keys = importantDates.keySet();
        System.out.println(keys);



        boolean b = keys.contains("Revolucion");
        System.out.println(b);

        ArrayDeque <DateTime> timeQueue = new ArrayDeque<>();
        timeQueue.add(new DateTime());
        
        LinkedList<ArrayDeque> queueList =  new PriorityQueue<>();
        queueList.add(timeQueue);

        DateTime t = queueList.get(2).peak();

        Vector<Double> vec = new Vector<>();
    }
}
