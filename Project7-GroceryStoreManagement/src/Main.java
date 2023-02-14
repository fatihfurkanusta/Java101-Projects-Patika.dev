import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] fruits=new String[]{"Pear","Apple","Tomato","Banana","Aubergine"};

        double choice;
        double sum = 0;

        System.out.println("Welcome to grocery store management");
        for(int i=0; i < fruits.length;i++){
            System.out.println(fruits[i]+" How many weight : ");
            choice= input.nextInt();
            switch(i){
                case 0:
                    sum+=(choice*2.14);
                    break;
                case 1:
                    sum+=(choice*3.67);
                    break;
                case 2:
                    sum+=(choice*1.11);
                    break;
                case 3:
                    sum+=(choice*0.95);
                    break;
                case 4:
                    sum+=(choice*5);
                    break;
            }
        }
        System.out.println("Toplam Tutar : "+sum);
    }
}