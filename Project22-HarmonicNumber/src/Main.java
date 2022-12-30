import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum=0;

        System.out.println("Sayıyı giriniz : ");
        int num = input.nextInt();

        for(double i=1;i<=num;i++){
            sum+=1/i;

        }
        System.out.println("Sonuç : "+sum);
    }
}