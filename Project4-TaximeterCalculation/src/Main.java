import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("How many kilometers did you go : ");
        int km= input.nextInt();
        double amount = km*2.2;

        if(amount>10 && amount<20){
            System.out.println("Amount : "+amount+" $");
        }
        else if(amount>20){
            System.out.println("Amount : "+amount+" $");
        }
        else{
            System.out.println("Amount : 10 $");
        }

    }
}