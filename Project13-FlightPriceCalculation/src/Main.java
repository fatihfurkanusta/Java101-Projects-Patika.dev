import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Gideceğiniz yer kaç km : ");
        int km = input.nextInt();

        System.out.println("Yaşınız kaç : ");
        int age = input.nextInt();

        System.out.println("Yolculuk tipini seçiniz (Tek Yön için '1'e basınız. Gidiş-Dönüş için '2'ye basınız. : ");
        int ftype = input.nextInt();

        if(km>0 && age>0 && (ftype==1 || ftype == 2)){
            double totalPrice = km * 0.1;

            if(age<12){
                double salePrice = totalPrice-(totalPrice*0.5);
                double type2Price = (salePrice-(salePrice*0.2))*2;

                if(ftype==2){
                    int type2=0;
                    System.out.println("Ödemeniz Gereken Tutar : "+type2Price);
                }else{
                    System.out.println("Ödemeniz Gereken Tutar : "+salePrice);
                }

            }else if(age<24){
                double salePrice = totalPrice-(totalPrice*0.1);
                double type2Price = (salePrice-(salePrice*0.2))*2;

                if(ftype==2){
                    System.out.println("Ödemeniz Gereken Tutar : "+type2Price);
                }else{
                    System.out.println("Ödemeniz Gereken Tutar : "+salePrice);
                }
            }

            else if(age>65){
                double salePrice = totalPrice-(totalPrice*0.3);
                double type2Price = (salePrice-(salePrice*0.2))*2;

                if(ftype==2){
                    System.out.println("Ödemeniz Gereken Tutar : "+type2Price);
                }else{
                    System.out.println("Ödemeniz Gereken Tutar : "+salePrice);
                }

            }else{
                double type2Price = (totalPrice-(totalPrice*0.2))*2;

                if(ftype==2){
                    System.out.println("Ödemeniz Gereken Tutar : "+type2Price);
                }else{
                    System.out.println("Ödemeniz Gereken Tutar : "+totalPrice);
                }
            }
        }else{
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}