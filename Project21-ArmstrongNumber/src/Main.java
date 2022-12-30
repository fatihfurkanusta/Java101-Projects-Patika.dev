import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int i = 0;

        System.out.println("Sayıyı giriniz : ");
        int num = input.nextInt();

        do {
            sum += num / 10;
            i = num / 10;
        } while (i > 1);

        System.out.println("Sonuç : " + sum);
    }
}
