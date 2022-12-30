import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.print("Dizinin boyutu  : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //int[] list = new int[5];
        int[] list2 = new int[5];

        /*for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı giriniz : ");
            list[i] = input.nextInt();
        } */
        int[] list={15,10,10,15,10};
        Arrays.sort(list);
        System.out.println("Dizi  : " + Arrays.toString(list));

        int repeatedNumber = 0;
        for (int r : list) {
            int a = 0;
            for (int j = 0; j < list.length; j++) {
                if (r == list2[j]) {
                    a++;
                    System.out.println("yes");
                }
            }
            if (a == 0) {
                int counter = 0;
                for (int i : list) {
                    if (r == i) {
                        counter++;
                    }
                }
                list2[repeatedNumber] = r;
                repeatedNumber++;
                System.out.println(r + " sayısından " + counter + " tane var ");
            }

        }System.out.println(Arrays.toString(list2));
    }
}