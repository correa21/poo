package com.ac.model;

public class Estadisticas {
    public static int veces;

    public static double promedio(double arr[]){
        veces++;
        double sum = 0.0;
        for(double d : arr)
            sum+=d;
        return sum/arr.length;
    }
}
