//package domain;

public class Literales{

    public static void main(String[] args) {
        /*Ejemplo de asignacion de literales y tipos de variables*/
        //enteros
        int integer1 = 1_000_000;
        long longInteger1 = 3000000000L; //entero muy grande, aniadimos L
        long longInteger2 = 3000000; //permitido
        System.out.println(integer1);
        System.out.println(longInteger1);
        //reales
        float firstFloat = 24.37f; //necesita llevar f porque
        double firstDouble = 24.37;//double es predetermiado para punto flotante
        System.out.println(firstFloat);
        System.out.println(firstDouble);
        //Cadenas de caracteres
        String phrase1 = " Hola ";
        char character = phrase1.charAt(3);
        int integer2 = phrase1.length();
        String phrase2 = phrase1.toUpperCase();
        String phrase3 = phrase1.trim();
        System.out.println(character);
        System.out.println(integer2);
        System.out.println(phrase2);
        System.out.println(phrase1);
        System.out.println(phrase3);
  }
}
