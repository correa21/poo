
public class EjerciciosClase {
    public static void main(String[] args) {
        /*EJERCICIO 1*/
    //     int[][] A = {{1, 2}, {4, 5}};
    //     int[][] b = {{1, 2,}, {4, 5}};
    //     int[][] c;
    //
    //     System.out.println("MATRIZ 1");
    //     visualizarMatriz(A);
    //     System.out.println("\nMATRIZ 2");
    //     visualizarMatriz(b);
    //
    //     if(A[0].length == b[0].length && A.length == b.length)
    //     {
    //         c = new int[A.length][A[0].length];
    //         for(int i=0;i<A.length;i++)
    //         {
    //             for(int j=0;j<A[0].length;j++)
    //             {
    //                 c[i][j] = A[i][j] + b[i][j];
    //             }
    //         }
    //     }
    //     else
    //     {
    //         c = null;
    //     }
    //     if(c == null){
    //         System.out.println("\nNo se puede realizar la suma de las matrices.");
    //     }
    //     else
    //     {
    //         System.out.println("\nMATRIZ RESULTANTE");
    //         visualizarMatriz(c);
    //     }
    // }
    // static void visualizarMatriz(int[][] matriz)
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

    /*EJERCICIO 2*/
    short[] Vector = {107, 25, 30, 27, 22};
    short[] Vector1 = new short[Vector.length];
    short[] Vector2 = new short[Vector.length];
    int x = 50;
    int j = 0;
    int h = 0;
    for(int i = 0; i < Vector.length; i++) {
        if (Vector[i] > x) {
            Vector1[j] = Vector[i];
                j++;
           }
       if ((Vector[i] % 2) != 0) {
           Vector2[h] = Vector[i];
           h++;
       }
   }
   System.out.println("Elementos mayores a x = " + j);
   System.out.println("Elementos impares = " + h);
}
