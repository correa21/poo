import javax.swing.*;
import java.util.*;

public class EjerciciosIntegradores{

    public static void main(String[] args){
        /*EJERCICIO 1*/
/*
        String passcode = "secret";
        int trys = 0;
        String input = "";
        do
        {
            if (trys < 0)
            {
                System.out.println("Clave Incorrecta");
            }
            input = JOptionPane.showInputDialog(null, "Introduce la contrasenia: ", "input", JOptionPane.QUESTION_MESSAGE);
            trys++;
            if (input == null)
            {
                break;
            }
            if (input == "")
            {
                continue;
            }
        }while(!input.equals(passcode));

        if (input == null)
        {
            System.out.println("Te rendiste");
        }
        else
        {
            System.out.println("Acertaste en " + trys + " intentos");
        }
*/

        /*EJERCICIO 2*/
         double arguments = 0;
         double iterator = 0;
         double pi = 0;
         double sum = 0;
         Scanner scan = new Scanner(System.in);
         System.out.println("Numero De Operandos: ");
         arguments = scan.nextInt();
         for (iterator = 1 ; iterator < arguments ; iterator++)
         {
            double element = Math.pow(-1, iterator + 1) / (2 * iterator - 1);
            sum += element;
         }
         pi = 4 * sum;
         System.out.println("Pi = " + pi);
    }
}
