package tests;

import quadratic.*;
import java.util.*;

public class TestQuadratic
{
    public static void main(String[] args)
    {
        int a,b,c,salida;
        Scanner input = new Scanner(System.in);
        for(;;){
            clearScreen();
            System.out.println("Ingrese los valores de A, B, C de la equacion cuadrática Ax^2 + Bx + C separados por un enter");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            Quadratic q = new Quadratic(a, b, c);
            clearScreen();
            q.solve();
            System.out.println(q.toString());
            System.out.printf("\n");
            System.out.printf("Quiere continuar?\n\t1)Si\n\t2)No\n");
            salida = input.nextInt();
            if(salida != 1)
                break;
        }
        input.close();
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
