import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{2,5,3},{4,5,6},{5,0,1}};
        int[][] b = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        printMatris(b);

    }
    static void printMatris(int[][] b){
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}