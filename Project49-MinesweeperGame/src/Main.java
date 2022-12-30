import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Set the Game Area.");

        System.out.println("Enter the row : ");
        int row = input.nextInt();

        System.out.println("Enter the column : ");
        int col = input.nextInt();

        MineSweeper2 mine = new MineSweeper2(row,col);
        mine.run();


    }
}