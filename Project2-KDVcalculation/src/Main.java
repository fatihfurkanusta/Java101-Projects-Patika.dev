import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the price of the product : ");
        int price= input.nextInt();

        if(price>1000){
            System.out.println("KDV amount of the product :"+price*0.08);
        }
        else if (price<1000 && price>0){
            System.out.println("KDV amount of the product :"+price*0.18);
        }
        else{
            System.out.println("Enter a valid price");
        }
    }
}