import java.util.Scanner;

public class Main {

    static int metot(int a, int n) {

        if (a > 0) {
            System.out.print(a + " ");
            a -= 5;
            return metot(a, n);
        }
        return metot2(a, n);


    }

    static int metot2(int a, int n) {
        if (a <= n) {
            System.out.print(a + " ");
            a += 5;
            return metot2(a, n);
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a number: ");
            n = mec.nextInt();
            int a = n;
            metot(a, n);
            System.out.println();

        } while (n > 0);
    }
}