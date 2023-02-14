import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);

        System.out.println("Burç Bulma Programına Hoşgeldiniz"); //Switch-case kullanılmadan yapılmıştır.
        System.out.println("Doğdunuz Ayı Giriniz : ");
        month = input.nextInt();
        System.out.println("Doğdunuz Günü Giriniz : ");
        day = input.nextInt();

        if (month == 1 && day < 22) {
            System.out.println("Burcunuz Oğlak");
        }
        if (month == 1 && day > 21) {
            System.out.println("Burcunuz Kova");
        }
        if (month == 2 && day < 20) {
            System.out.println("Burcunuz Kova");
        }
        if (month == 2 && day > 19) {
            System.out.println("Burcunuz Balık");
        }
        if (month == 3 && day < 21) {
            System.out.println("Burcunuz Balık");
        }
        if (month == 3 && day > 20) {
            System.out.println("Burcunuz Koç");
        }
        if (month == 4 && day < 21) {
            System.out.println("Burcunuz Koç");
        }
        if (month == 4 && day > 20) {
            System.out.println("Burcunuz Boğa");
        }
        if (month == 5 && day < 22) {
            System.out.println("Burcunuz Boğa");
        }
        if (month == 5 && day > 21) {
            System.out.println("Burcunuz İkizler");
        }
        if (month == 6 && day < 23) {
            System.out.println("Burcunuz İkizler");
        }
        if (month == 6 && day > 22) {
            System.out.println("Burcunuz Yengeç");
        }
        if (month == 7 && day < 24) {
            System.out.println("Burcunuz Yengeç");
        }
        if (month == 7 && day > 23) {
            System.out.println("Burcunuz Aslan");
        }
        if (month == 8 && day < 23) {
            System.out.println("Burcunuz Aslan");
        }
        if (month == 8 && day > 22) {
            System.out.println("Burcunuz Başak");
        }
        if (month == 9 && day < 25) {
            System.out.println("Burcunuz Başak");
        }
        if (month == 9 && day > 24) {
            System.out.println("Burcunuz Terazi");
        }
        if (month == 10 && day < 23) {
            System.out.println("Burcunuz Terazi");
        }
        if (month == 10 && day > 22) {
            System.out.println("Burcunuz Akrep");
        }
        if (month == 11 && day < 22) {
            System.out.println("Burcunuz Akrep");
        }
        if (month == 11 && day > 21) {
            System.out.println("Burcunuz Yay");
        }
        if (month == 12 && day < 22) {
            System.out.println("Burcunuz Yay");
        }
        if (month == 12 && day > 21) {
            System.out.println("Burcunuz Oğlak");
        }
    }
}