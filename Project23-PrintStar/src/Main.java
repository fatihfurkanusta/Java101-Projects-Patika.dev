import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Basamak sayısını giriniz : ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++){

            for(int j=-1; j<=(num-i); j++){
                System.out.print(" ");
            }

            for(int k=1; k<=((2*i)-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num; i>=0; i--){

            for(int j=num-i; j>=0; j--){
                System.out.print(" ");
            }

            for(int k=2*i-1; k>=-1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}