import java.util.*;

public class Main{

    public static void main(String[] args) {
         /*EJERCICO 3*/
         int min = 2;
         int max = 20;
         int rows = 3;
         int columns = 3;
         int suma = 0;
         int[][] matrix = new int[3][3];
         int[] numeros = getNumbers(min,max,(rows*columns));
         for (int row = 0; row < matrix.length ; row++){
             for (int col = 0; col < matrix[0].length; col++){
                 matrix[row][col] =numeros[(matrix.length*row) + col ];
             }
         }
         visualizarMatriz(matrix);
         if(itsRow()){
            System.out.println("Se ha elegido Fila");
            //Generamos el indice de la fila
            int fila_columna_indice=selectRow_Col(0,matrix.length-1);
            System.out.println("Se ha elefio el indice: "+fila_columna_indice);

            for(int i=0;i<matrix[0].length;i++){
                 suma += matrix[fila_columna_indice][i];
            }
        }else{
            System.out.println("Se ha elegido Columna");
            //Generamos el indice de la fila
            int fila_columna_indice=selectRow_Col(0,matrix[0].length-1);
            System.out.println("Se ha elefio el indice: "+fila_columna_indice);

            for(int i=0;i<matrix.length;i++){
                 suma += matrix[i][fila_columna_indice];
            }
        }
        System.out.println(suma);
     }

    static void visualizarMatriz(int[][] matriz){

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static int[] getNumbers (int min, int max, int length){
        boolean found = false;
        int[] numbers = new int [length];
        int numOfElements = 0;
        int random = 0;
        Arrays.fill(numbers,min-1);
        while (numOfElements < length) {
            random = (int) (Math.random()*(max - min) + min);
            found = false;

            for (int i = 0 ; i <numbers.length && !found ; i++){
                if (random == numbers[i]) {
                    found = true;
                }
            }
            if (!found) {
                numbers[numOfElements] = random;
                numOfElements += 1;
            }
        }
        return numbers;
    }
    private static int selectRow_Col(int min, int max){
        int num=(int)Math.floor(Math.random()*(max-min+1)+(min));
        return num;
    }
    private static int sum(int[] RowCol){
        int suma = 0;
        for (int  i = 0 ; i < RowCol.length ; i++) {
            suma += RowCol[i];
        }
        return suma;
    }
    private static boolean itsRow(){
        if (((int) (Math.random()*(50 - 2) + 2) % 2) == 1){
            return true;
        }
        return false;
    }
}
