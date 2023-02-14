import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int year = input.nextInt();

        if (year%4==0){
            if(year%100==0){
                if(year%400==0) {
                    System.out.println(year + " artık yıldır.");
                }
            }else{
                System.out.println(year+" artık yıldır.");
            }
        }else{
            System.out.println(year+" artık yıl değildir.");
        }
    }
}