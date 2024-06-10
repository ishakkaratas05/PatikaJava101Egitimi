package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {

        double ürünFiyati, kdvliFiyat ,kdvTutari, kdvOrani =0.18 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün Fiyatını Giriniz : ");
        ürünFiyati = input.nextInt();

        kdvTutari = (ürünFiyati * kdvOrani);
        kdvliFiyat = ürünFiyati + kdvTutari;

        System.out.println("Çıktılar :");
        System.out.println(" ");
        System.out.println("KDV'siz Fiyatı :" + ürünFiyati);
        System.out.println("--------------------------------");
        System.out.println("KDV Oranı :" + kdvOrani);
        System.out.println("--------------------------------");
        System.out.println("KDV Tutarı :" + kdvTutari);
        System.out.println("--------------------------------");
        System.out.println("KDV'li Fiyatı :" + kdvliFiyat);



    }
}
