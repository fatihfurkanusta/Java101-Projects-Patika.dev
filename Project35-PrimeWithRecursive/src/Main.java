import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;

        System.out.println("Prime Numbers");
        numb = input.nextInt();

        if(isPrimeNumber(numb,2)){
            System.out.println(numb + " is a prime number.");
        }else{
            System.out.println(numb+" is not a prime number.");
        }
    }

    static boolean isPrimeNumber(int n, int i) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrimeNumber(n, i + 1);
    }
}