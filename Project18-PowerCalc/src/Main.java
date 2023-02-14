import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        for(int i=1; i<=num; i*=4){
            System.out.println(i);
        }
        System.out.println("----------------------------------------");

        for(int i=1; i<=num; i*=5){
            System.out.println(i);
        }

    }
}