public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ramazan Hoca","TRH","0500 000 00 01");
        Teacher t2 = new Teacher("Kemal Hoca","FZK","0500 000 00 02");
        Teacher t3 = new Teacher("Semih Hoca","BİO","0500 000 00 03");

        System.out.println("------------------------------------------------------");

        Dersler tarih = new Dersler("Tarih","101","TRH");
        tarih.ogretmenEkle(t1);

        Dersler fizik = new Dersler("Fizik","102","FZK");
        fizik.ogretmenEkle(t2);

        Dersler biyoloji = new Dersler("Biyoloji","103","BİO");
        biyoloji.ogretmenEkle(t3);

        System.out.println("------------------------------------------------------");

        Student s1 = new Student("Ali","001","4",tarih,fizik,biyoloji);
        System.out.println("\n - Öğrenci-1 not durumu - ");
        s1.notEkle(100,20,50);
        s1.isPass();

        Student s2 = new Student("Murat","002","3",tarih,fizik,biyoloji);
        System.out.println("\n - Öğrenci-2 not durumu - ");
        s2.notEkle(80,100,90);
        s2.isPass();

    }
}
