import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth year.");
        int year = input.nextInt();

        switch (year % 12) {
            case 0 -> System.out.println("Your zodiac is Monkey.");
            case 1 -> System.out.println("Your zodiac is Cock.");
            case 2 -> System.out.println("Your zodiac is Dog.");
            case 3 -> System.out.println("Your zodiac is Pig.");
            case 4 -> System.out.println("Your zodiac is Mouse.");
            case 5 -> System.out.println("Your zodiac is Ox.");
            case 6 -> System.out.println("Your zodiac is Tiger.");
            case 7 -> System.out.println("Your zodiac is Rabbit.");
            case 8 -> System.out.println("Your zodiac is Dragon.");
            case 9 -> System.out.println("Your zodiac is Snake.");
            case 10 -> System.out.println("Your zodiac is Horse.");
            case 11 -> System.out.println("Your zodiac is Sheep.");
        }


    }
}