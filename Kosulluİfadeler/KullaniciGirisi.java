package Kosulluİfadeler;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String sifre, kullaniciadi, yeniSifre;

        Scanner giris = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz : ");
        kullaniciadi = giris.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        sifre = giris.nextLine();

        if (kullaniciadi.equals("ishak") && sifre.equals("123")) {
            System.out.println("Sisteme Başarılı Bir Şekilde Giriş Yaptınız.");
        } else {
            System.out.println("Hatalı Giriş!");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = giris.nextLine();

            if (cevap.equals("evet")) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                yeniSifre = giris.nextLine();

                if (yeniSifre.equals("123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }

        giris.close(); // Scanner nesnesini kapat
    }
}
