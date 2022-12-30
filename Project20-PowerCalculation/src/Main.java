import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=1;

        System.out.println("Sayıyı giriniz : ");
        int num = input.nextInt();

        System.out.println("Üs olacak sayıyı giriniz : ");
        int pnum = input.nextInt();

        for(int i=1; i<=pnum;i++){
            sum*=num;
        }

        System.out.println("Sonuç : "+sum);

    }
}