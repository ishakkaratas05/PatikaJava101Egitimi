public class Calisan {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Calisan(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama: Maaş 1000 TL'den fazlaysa %3 vergi uygulanır
    double vergiHesapla() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    // Bonus hesaplama: 40 saatten fazla çalışılan her saat için 30 TL eklenir
    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    // Maaş artışı: Çalışma yılına göre zam yapılır
    double maasArtisi() {
        int buYil = 2024;
        int calismaYili = buYil - this.hireYear;

        if (calismaYili < 10) {
            return this.salary * 0.05;
        } else if (calismaYili < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    // Çalışana ait bilgileri göstermek için
    void bilgiGoster() {
        double vergi = vergiHesapla();
        int bonus = bonus();
        double artis = maasArtisi();

        // Vergi ve bonus sonrası maaş
        double vergiBonusMaas = this.salary - vergi + bonus;

        // Toplam maaş (zam dahil)
        double toplamMaas = vergiBonusMaas + artis;

        System.out.println("Adı-Soyadı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlama Yılı : " + this.hireYear);
        System.out.println("Vergi : " + vergi);
        System.out.println("Bonus : " + bonus);
        System.out.println("Maaş Artışı : " + artis);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + vergiBonusMaas);
        System.out.println("Toplam Maaş : " + toplamMaas);
    }
}

