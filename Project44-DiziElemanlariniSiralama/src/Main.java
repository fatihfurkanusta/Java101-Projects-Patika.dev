import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y;
        int n;
        System.out.println("Dizinin boyutunu giriniz : ");
        n = input.nextInt();
        int[] list = new int[n];

        for (int i=0; i < list.length; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elamanını giriniz : ");
            y = input.nextInt();
            list[i] = y;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}