import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    static Scanner input = new Scanner(System.in);

    static void printField(String[][] field) {
        for (String[] i : field) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    static int userChoiceRow(int row) {
        System.out.println("Enter your guess.");
        while (true) {
            System.out.println("Row : ");
            int srow = input.nextInt();


            if (srow < 0 || srow > row) {
                System.out.println("Please input the valid numbers.");
                continue;
            }
            return srow;
        }
    }
    static int userChoiceCloumn(int col){
        while(true){
            System.out.println("Cloumn : ");
            int scol = input.nextInt();

            if(scol<0 || scol>col){
                System.out.println("Please input the valid numbers.");
                continue;
            }
            return scol;
        }
    }

    static void checkMine(String[][] mineField, int srow, int scol){
        if(mineField[srow][scol]=="*"){
            System.out.println("Game Over!");
        }
    }


    static void createField(int row, int col) {
        Random rand = new Random();
        String[][] mineField = new String[row][col];
        int elements = row * col;
        int mine = elements / 4;
        int i = 0;

        for (int k = 0; k < mineField.length; k++) {
            for (int l = 0; l < mineField[0].length; l++) {
                mineField[k][l] = "-";
            }
        }

        while (i < mine) {
            int xrow = rand.nextInt(row);
            int xcol = rand.nextInt(col);
            mineField[xrow][xcol] = "*";
            i++;
        }
        printField(mineField);

        int srow = userChoiceRow(row);
        int scol = userChoiceCloumn(col);

        checkMine(mineField,srow,scol);


    }


    static void setArea() {
        System.out.println("Set the Game Area.");

        System.out.println("Enter the row : ");
        int row = input.nextInt();

        System.out.println("Enter the cloumn : ");
        int col = input.nextInt();

        String[][] field= new String[row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                field[i][j]="-";
            }
        }

        printField(field);
        createField(row, col);

    }

    static void run() {
        setArea();


    }

}
