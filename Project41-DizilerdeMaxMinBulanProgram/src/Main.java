import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        maxMin(list);

        System.out.println(findNumber(list));

    }
    static void maxMin(int[] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("En Büyük Sayı : "+array[array.length-1]);
        System.out.println("En Küçük Sayı : "+array[0]);
    }
    static int findNumber(int[] array){
        Scanner input= new Scanner(System.in);
        System.out.println("Input a Number : ");
        int numb=input.nextInt();
        int numb2=0;

        for (int i=0;i<array.length;i++){
            if(array[i]>numb){
                return array[i-1];
            }
        }return 0;
    }
}