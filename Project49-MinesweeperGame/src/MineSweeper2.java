import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper2 {
    int row; //map row
    int col; // map column
    int usrow; // Number of rows received from the user
    int uscol; // Number of columns received from the user
    int mine;
    boolean stop=false;
    String[][] map = new String[row][col];
    String[][] mineMap = new String[row][col];
    static Scanner input = new Scanner(System.in);

    MineSweeper2(int row, int col) {
        this.row = row;
        this.col = col;
    }
    void run() {
        createMap();
        mineMap();
        System.out.println("Number of mines : "+this.mine);
        //printField(mineMap);
        while (true) {
            userChoiceRow();
            userChoiceCloumn();
            TargetCheck();
            finish();
            if(stop){
                printField(map);
                System.out.println("-------------------------- Game Over! --------------------------");
                System.out.println("----------------------------------------------------------------");
                break;
            }
            printField(map);
        }

    }
    void userChoiceRow() {
        System.out.println("Enter your guess.");
        while (true) {
            System.out.println("Row : ");
            int usrow = input.nextInt();


            if (usrow < 0 || usrow >= this.row) {
                System.out.println("Please input the valid numbers.");
                continue;
            }
            this.usrow = usrow; // alınan değeri sabitliyorum.
            break;
        }
    }
    void userChoiceCloumn() {
        while (true) {
            System.out.println("Cloumn : ");
            int uscol = input.nextInt();

            if (uscol < 0 || uscol >= this.col) {
                System.out.println("Please input the valid numbers.");
                continue;
            }
            this.uscol = uscol; // alınan değeri sabitliyorum.
            break;
        }
    }
    void createMap() {

        String[][] map = new String[this.row][this.col];
        this.map = map;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                map[i][j] = "-";
            }
        }
        printField(map);
    }
    void mineMap() {
        Random rand = new Random();
        String[][] mineMap = new String[this.row][this.col];
        this.mineMap = mineMap;
        int elements = this.row * this.col;
        int mine = elements / 4;
        this.mine = mine;
        int i = 0;

        for (int k = 0; k < mineMap.length; k++) {
            for (int l = 0; l < mineMap[0].length; l++) {
                mineMap[k][l] = "-";
            }
        }
        while (i < mine) {
            int xrow = rand.nextInt(this.row);
            int xcol = rand.nextInt(this.col);
            if(mineMap[xrow][xcol]=="*"){
                continue;
            }
            mineMap[xrow][xcol] = "*";
            i++;
        }

        //printField(mineMap);
    }

    static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) { //
            for (int j = 0; j < field[0].length; j++) { //
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------");
    }
    public void finish() {
        int line = 0;
        for (int i = 0; i < this.map.length; i++) { //
            for (int j = 0; j < this.map[0].length; j++) {
                if (this.map[i][j] == "-") {
                    line++;
                }
            }
        }
        if (line == this.mine) {
            System.out.println("-------------------- Congrats! You Win -------------------------");
            System.out.println("----------------------------------------------------------------");
            this.stop=true;
        }
    }

        void TargetCheck() {
            int srow = this.usrow;
            int scol = this.uscol;
            int count = 0;

            if (Objects.equals(this.mineMap[srow][scol], "*")) {
                //Game Over
                this.map[srow][scol] = "*";
                this.stop = true;

            } else {
                if (Objects.equals(mineMap[srow][scol], "-")) {
                    if ((scol < this.col - 1) && (Objects.equals(mineMap[srow][scol + 1], "*"))) {
                        count++;
                    }
                    if ((srow < this.row - 1) && (Objects.equals(mineMap[srow + 1][scol], "*"))) {
                        count++;

                    }
                    if ((srow > 0) && (Objects.equals(mineMap[srow - 1][scol], "*"))) {
                        count++;

                    }
                    if ((scol > 0) && (Objects.equals(mineMap[srow][scol - 1], "*"))) {
                        count++;

                    }
                    if ((srow < this.row - 1) && (scol < this.col - 1) && (Objects.equals(mineMap[srow + 1][scol + 1], "*"))) {
                        count++;

                    }
                    if ((srow > 0) && (scol < this.col - 1) && (Objects.equals(mineMap[srow - 1][scol + 1], "*"))) {
                        count++;

                    }
                    if ((srow < this.row - 1) && (scol > 0) && (Objects.equals(mineMap[srow + 1][scol - 1], "*"))) {
                        count++;

                    }
                    if ((srow > 0) && (scol > 0) && (Objects.equals(mineMap[srow - 1][scol - 1], "*"))) {
                        count++;

                    }
                    switch (count) {

                        case 1 -> this.map[this.usrow][this.uscol] = "1";
                        case 2 -> this.map[this.usrow][this.uscol] = "2";
                        case 3 -> this.map[this.usrow][this.uscol] = "3";
                        case 4 -> this.map[this.usrow][this.uscol] = "4";
                        case 5 -> this.map[this.usrow][this.uscol] = "5";
                        case 6 -> this.map[this.usrow][this.uscol] = "6";
                        case 7 -> this.map[this.usrow][this.uscol] = "7";
                        case 8 -> this.map[this.usrow][this.uscol] = "8";
                        default -> {
                            for (int i = -1; i < 2; i++) {
                                for (int j = -1; j < 2; j++) {
                                    this.map[srow][scol] = "0";

                                }
                            }
                        }
                    }
                }
            }
        }
    }
