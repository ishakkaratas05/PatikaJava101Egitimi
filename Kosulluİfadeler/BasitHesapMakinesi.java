package Kosulluİfadeler;

import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {

        double sayi1,sayi2;
        int islem;

        Scanner giris = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        sayi1 = giris.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz : ");
        sayi2 = giris.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        islem = giris.nextInt();

        switch (islem){
            case 1 :
                System.out.println("Toplama İşlemi : " + (sayi1+sayi2));
                break;
            case 2 :
                System.out.println("Çıkarma İşlemi : " + (sayi1-sayi2));
                break;
            case 3 :
                System.out.println("Çarpma İşlemi : " + (sayi1*sayi2));
                break;
            case 4 :
               if (sayi2 != 0){
                   System.out.println("Bölme İşlemi : " + (sayi1/sayi2));
               }else{
                   System.out.println("Sıfıra Bölme Hatası");
               }
                break;
            default:
                System.out.println("Geçersiz Karakter Tekrar Deneyiniz.");
        }
    }
}
