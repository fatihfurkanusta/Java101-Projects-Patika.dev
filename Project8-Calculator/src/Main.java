import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int choice;
        int result=0;

        System.out.println("Welcome to calculator program");
        System.out.println("Enter first number : ");
        firstNumber = input.nextInt();
        System.out.println("Enter second number : ");
        secondNumber = input.nextInt();

        System.out.println("Press 1 for Sum / Press 2 for Minus / Press 3 for Multiply / Press 4 for Divide ");
        choice = input.nextInt();

        switch (choice){
            case 1 :
                result = firstNumber+secondNumber;
                break;
            case 2 :
                result = firstNumber-secondNumber;
                break;
            case 3 :
                result = firstNumber*secondNumber;
                break;
            case 4 :
                result = firstNumber/secondNumber;
                break;
        }
        System.out.println("Result : "+result);
    }
}