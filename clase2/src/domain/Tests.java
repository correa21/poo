import java.util.*;
import javax.swing.*;
public class Tests{

    public static void main(String[] args){
        /*EJERCICIO 4*/
        //using scanner
        // Scanner in = new Scanner(System.in);
        // System.out.println("Introduce tu nombre: ");
        // String name = in.nextLine();
        // System.out.println("Bienvenido: " + name);

        /*EJERCICIO 5*/
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Introduce un radio: ");
        // double radio = scan.nextDouble();
        // double area = Math.PI * Math.pow(radio, 2);
        // System.out.println("El area del circulo es " + area);

        /*EJERCICIO 6*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un entero");
        double number = sc.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("El numero es divisible entre dos");
        }
        else
        {
            System.out.println("El numero NO es divisible entre dos");
        }
        sc.close();

    }

}
