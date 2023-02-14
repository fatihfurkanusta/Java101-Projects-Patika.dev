import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        double height;
        double formul;


        System.out.println("Welcome to Body Mass Index");

        System.out.println("Enter your weight (75 kg) : ");
        weight=input.nextDouble();
        System.out.println("Enter your height (1,75 meters) : ");
        height=input.nextDouble();

        formul=weight/(height*height);

        System.out.println("Your Body Mass Index : "+formul);
    }
}