import java.util.Scanner;

public class Main {
    static boolean isPalindrom(String str){
        int i =0;
        int j = str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word : ");
        String selected = input.nextLine();

        if(isPalindrom(selected)){
            System.out.println(selected+" is a Palindrome Word.");
        }else{
            System.out.println(selected+" isn't a Palindrome Word.");
        }

    }
}