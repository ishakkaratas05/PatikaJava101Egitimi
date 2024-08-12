public class Student {
    Dersler d1;
    Dersler d2;
    Dersler d3;
    String name;
    String studentNo;
    String sinifi;
    double ortalama;
    boolean isPass;

    Student(String name, String studentNo, String sinifi, Dersler d1, Dersler d2, Dersler d3) {
        this.name = name;
        this.studentNo = studentNo;
        this.sinifi = sinifi;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.ortalama = 0.0;
        this.isPass = false;
    }

    void notEkle(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100) {
            this.d1.note = not1;
        }
        if (not2 >= 0 && not2 <= 100) {
            this.d2.note = not2;
        }
        if (not3 >= 0 && not3 <= 100) {
            this.d3.note = not3;
        }
    }
    void isPass(){
        this.ortalama = (this.d1.note + this.d2.note + this.d3.note) / 3.0;
        if (this.ortalama>55){
            System.out.println("Sınıfı Geçtiniz." + "\n              ");
            this.isPass=true;
        }else{
            System.out.println("Sınıfta Kaldınız." + "\n              ");
            this.isPass=false;
        }
        notYazdir();
    }

    void notYazdir() {
        System.out.println(this.d1.name + " Notu\t: " + this.d1.note);
        System.out.println(this.d2.name + " Notu\t: " + this.d2.note);
        System.out.println(this.d3.name + " Notu\t: " + this.d3.note);
        System.out.println("Ortalamanız : " + this.ortalama);
    }
}

