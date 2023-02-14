import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Üçgenin dik kenar uzunluklarından birini giriniz : ");
        int a=input.nextInt();
        System.out.println("Diğer dik kenarının uzunluğunu giriniz : ");
        int b=input.nextInt();
        int c = (int) Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs = "+c);
    }
}