public class Experimento2 {
    public static void main(String[] args) {
        int N = 100_000;
        int M = 100_000_000;
        int min = 2;
        int max = 200;

        for(int i = 0;i < N ; i++){
            int [] array = new int[M];
            array[0] = (int) (Math.random()*(max - min) + min);
            System.out.println(array[0]);
        }
    }

}
