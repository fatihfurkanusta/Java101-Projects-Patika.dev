import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int i = 0;
        int number = rand.nextInt(100);
        System.out.println("------------------ Welcome to Guess Number Game ------------------");
        System.out.println("You have 5 right to find the right number.");

        while (i < 5) {
            System.out.println("--------------------------------------------------");
            System.out.println("Enter your guess : ");
            int j = input.nextInt();

            if(j<0 || j>100){
                System.out.println("Please input a valid number.");
                continue;
            }
            if (j == number) {
                System.out.println("*** Congrats! You win.***");
                break;
            } else if (j < number) {
                System.out.println("The number you guessed is low.");
                System.out.println("Your right : "+(4-i));
            } else {
                System.out.println("The number you guessed is high.");
                System.out.println("Your right : "+(4-i));
            }
            i++;
        }
        if (i >= 5) {
            System.out.println("Unfortunatelly. You lost. :(");
        }
    }
}