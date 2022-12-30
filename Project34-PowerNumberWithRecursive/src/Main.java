import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Taban Değeri giriniz : ");
        int num1 = input.nextInt();

        System.out.print("Üs Değeri giriniz : ");
        int num2 = input.nextInt();

        if(num1 == 0 && num2 == 0){
            System.out.println(num1 + " nın " + num2 + " nci kuvveti : Belirsizdir.");
        } else if(num2 >= 0){
            System.out.println("Sonuç : "+powerP(num1,num2));
        } else {
            System.out.println("Sonuç : "+powerN(num1,num2));
        }
    }
    static int powerP(int a,int b){
        if(b == 0){
            return 1;
        }else {
            return a * powerP(a,b-1);
        }
    }
    static double powerN(int a,int b){
        if(b == 0){
            return 1;
        }else {
            return (1.0/a)*(powerN(a,b+1)) ;
        }
    }
}