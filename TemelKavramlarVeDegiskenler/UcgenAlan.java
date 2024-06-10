package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        /*  Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
            𝑢 = (a+b+c) / 2
            Alan = K * K = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */

        double x,y,z,u,cevre,alan,K;

        Scanner giris = new Scanner(System.in);

        System.out.println("Üçgeniniz için 3 kenar değerlerini giriniz:");
        x = giris.nextDouble();
        y = giris.nextDouble();
        z = giris.nextDouble();

        u = (x+y+z) / 2 ;
        K = u * (u - x)* (u - y) * (u - z);

        cevre = 2 * u ;
        alan = K*K;


        System.out.println("Çevre : " + cevre);
        System.out.println("Alan : " + alan);


    }
}
