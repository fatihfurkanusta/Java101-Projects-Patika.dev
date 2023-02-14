import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] classes = new String[]{"Math","Physics","Chemistry","Turkish","History","Music"};
        int j=0;
        int[] notes =new int[5];
        Scanner input=new Scanner(System.in);

        for(int i=0;i < classes.length-1;i++){
            System.out.println("Enter your" + classes[i] +"course grade : ");
            int note= input.nextInt();
            j+=note;
        }
        double avarage=j/classes.length;
        if(avarage>60){
            System.out.println("Congrats! You passed with "+avarage+" points.");
        }else {
            System.out.println("Unfortunately! You didn't pass with "+avarage+" points.");
        }
    }
}