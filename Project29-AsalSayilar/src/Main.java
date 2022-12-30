public class Main {
    public static void main(String[] args) {
        System.out.println("1-100 arasındaki asal sayılar : ");
        boolean isAsal=true;

        for (int i = 2; i < 100; i++) {
            isAsal=true;
            for (int j = 2; j<i; j++) {
                if(i%j==0){
                    isAsal=false;
                    break;
                }
            }
            if(isAsal){
                System.out.print(i+" ");
            }
        }

    }
}