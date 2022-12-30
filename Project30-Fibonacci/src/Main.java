import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i;

        System.out.println("Fibonacci Program");

        System.out.println("İnput a number : ");
        i= input.nextInt();
        System.out.println(fib(i));
    }
    static int fib(int n){
        if (n==1 || n==0){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}