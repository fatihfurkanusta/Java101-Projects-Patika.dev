import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int facx=1;
        int facy=1;
        int facz=1;
        double formul;

        System.out.println("Eleman sayısı giriniz : ");
        int x = input.nextInt();

        System.out.println("Kombinasyon sayısı giriniz : ");
        int y = input.nextInt();

        for(int i=1;i<=x;i++){
            facx*=i;
        }

        for(int i=1;i<=y;i++){
            facy*=i;
        }

        for(int i=1;i<=x-y;i++){
            facz*=i;
        }

        formul=facx/(facy*facz);

        System.out.println("Sonuç : "+ formul);
    }
}