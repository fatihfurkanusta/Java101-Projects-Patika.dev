import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        String name = input.nextLine();

        System.out.print("Kullanıcı Şifrenizi Giriniz : ");
        String pasw = input.nextLine();

        if(Objects.equals(name, "furkan") && Objects.equals(pasw, "123456")) {
            System.out.println("Giriş Yaptınız.");
        }else{
            System.out.println("Hatalı şifre girdiniz.\nŞifrenizi sıfırlamak ister misiniz? (evet için 'e' harfine, hayır için 'h' harfine basınız.");
            String choice=input.nextLine();
            if (Objects.equals(choice, "e")) {
                System.out.println("Yeni şifrenizi giriniz.");
                String pasw2=input.nextLine();
                if(!Objects.equals(pasw, pasw2)){
                    pasw=pasw2;
                    System.out.println("Şifre oluşturuldu");
                }else{
                    System.out.println("Şifre oluşturulamadı.");
                }
            }else{
                System.out.println("Program kapatıldı.");
            }
        }
    }
}