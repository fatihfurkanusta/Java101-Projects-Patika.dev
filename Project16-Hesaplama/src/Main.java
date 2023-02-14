import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int x = input.nextInt();
        int sum1=0;
        int sum2=0;
        int sum3=0;

        for(int i = 0 ; i<=x;i++){

            if(i%3==0){
                sum1+=i;
                System.out.println("3'e bölünen"+i);

            }
            if(i%4==0){
                sum2+=i;
                System.out.println("4'e bölünen"+i);
            }
        }
        System.out.println("Ortalama : "+(sum1+sum2)/2);
    }
}