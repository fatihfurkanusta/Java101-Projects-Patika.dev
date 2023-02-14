import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double a;
        double pi = 3.14;

        System.out.println("Enter the radius of the circle : ");
        r=input.nextInt();
        System.out.println("Enter the angle of circle segment : ");
        a=input.nextInt();

        System.out.println("The area of circle segment : "+(pi*r*r*a)/360);
    }
}