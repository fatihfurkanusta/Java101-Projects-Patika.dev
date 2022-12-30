import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum = 0;

        do{
            System.out.println("Bir sayı giriniz : ");
            num = input.nextInt();

            if(num%4==0){
                sum+=num;
            }

        } while(num%2==0);
        System.out.println("Toplam : " + sum);

    }
}