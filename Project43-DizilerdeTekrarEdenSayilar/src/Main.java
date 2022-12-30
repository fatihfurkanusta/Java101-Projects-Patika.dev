import java.util.Arrays;

public class Main {
    static boolean isFind(int[] list, int value){
        for (int j : list) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {1, 5, 4, 2, 2,5,4,3,8,1};
        int[] duplicate = new int[list.length];
        int index=0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if(!isFind(duplicate,list[i])){
                        duplicate[index++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.print("Tekrar Eden Sayılar : ");
        for(int i:duplicate){
            if(i!=0){
                System.out.print(i+" ");
            }
        }
    }
}