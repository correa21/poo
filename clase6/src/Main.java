import javax.swing.*;
import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
   //      /*EJERCICO 3*/
   //      int min = 2;
   //      int max = 20;
   //      int R = (int) (Math.random() * max) + min;
   //      int[][] matrix = new int[R][];
   //      for (int row = 0; row < R ; row++)
   //      {
   //          matrix[row] = new int[row + 1];
   //          for (int col = 0; col < row+1; col++)
   //          {
   //              matrix[row][col] = row + 1;
   //          }
   //      }
   //      visualizarMatriz(matrix);
   //
   //  }
   //  static void visualizarMatriz(int[][] matriz)
   // {
   //     for(int i=0;i<matriz.length;i++)
   //     {
   //         for(int j=0;j<matriz[i].length;j++)
   //         {
   //             System.out.print(matriz[i][j] + "\t");
   //         }
   //         System.out.println();
   //     }
   // }

       /*EJERCICIO4*/
       String input;
       String cali;
       int num;
       float mediana = 0.0f;
       input = JOptionPane.showInputDialog("¿Cuantas calificaciones va a capturarar?");
       num = Integer.parseInt(input);
       float[] calificaciones = new float[num];

       for(int i = 0; i < num ; i++)
       {
           cali = JOptionPane.showInputDialog("Calificacion " + (i + 1));
           calificaciones[i] = Float.parseFloat(cali);
       }

       Arrays.sort(calificaciones);
       if((num%2) != 0)
           mediana = calificaciones[(int)(num/2)];
       else
           mediana = (calificaciones[(num/2)] + calificaciones[(num/2)+1])/2;

       System.out.println("Mediana: " + mediana);
    }
}
