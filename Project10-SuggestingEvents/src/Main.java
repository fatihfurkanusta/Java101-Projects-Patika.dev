import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature : ");
        int temp = input.nextInt();

        if(temp<5){
            System.out.println("You can go to ski.");
        }else if(temp>5 && temp<15){
            System.out.println("You can go to cinema.");
        }else if(temp>15 && temp<25){
            System.out.println("You can go to picnic.");
        }else if(temp>=25) {
            System.out.println("You can go to swim.");
        }
    }
}