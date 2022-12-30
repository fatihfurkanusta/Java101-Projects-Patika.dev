import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find the palindrom number");
        System.out.println("İnput the number : ");
        numb = input.nextInt();
        isPalindrom(numb);
    }

    static boolean isPalindrom(int numb) {
        int temp = numb, reverseNumber = 0, lastnumber;

        while (temp > 0) {
            lastnumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastnumber;
            temp /= 10;
        }

        if (reverseNumber == numb) {
            System.out.println(numb + " is palindrom number.");
            return true;
        }else {
            System.out.println(numb + " isn't palindrom number.");
            return false;
        }
    }
}