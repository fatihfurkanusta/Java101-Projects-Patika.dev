import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the step number : ");
        int step= input.nextInt();

        for (int i= step;i>=1; i--){

            for (int a=0; a<step-i;a++){
                System.out.print(" ");
            }
            for (int b=2*i-1;b>0; b--){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}