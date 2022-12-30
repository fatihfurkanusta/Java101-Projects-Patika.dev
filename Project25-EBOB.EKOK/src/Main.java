import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("İlk sayıyı giriniz : ");
        int num1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        int num2 = input.nextInt();
        int i=num1;

        while (true) {
            if(i%num2==0){
                System.out.println("EKOK : "+i);
                System.out.println("EBOB : "+(num1*num2/i));
                break;
            }
            i+=num1;
        }
    }
}