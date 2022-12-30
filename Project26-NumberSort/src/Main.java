import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0,min = 0,max = 0, i = 1;

        System.out.print("Lütfen kaç adet saysı gireceğinizi belirtin :");
        n = input.nextInt();

        while (n > 0){
            System.out.print(i + ". sayıyı giriniz :");
            int sayi = input.nextInt();

            if(i == 1){
                min = sayi;
                max = sayi;
            }else {
                if (min > sayi) min = sayi;
                if (max < sayi) max = sayi;
            }
            n--;
            i++;
        }
        System.out.println("Max :" + max + " \nMin :" + min);
    }
}