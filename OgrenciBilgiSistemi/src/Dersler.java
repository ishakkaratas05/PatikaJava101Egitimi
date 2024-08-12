public class Dersler {
    Teacher ogretmen;
    String name;
    String code;
    String prefix;
    int note;

    Dersler(String name,String code,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void ogretmenEkle(Teacher ogretmen){
        if (ogretmen.branch.equals(this.prefix)){
            this.ogretmen = ogretmen;
            ogretmenBilgi();
        }else{
            System.out.println("Bu ders için eklebilecek bir öğretmen seçiniz!");
        }
    }

    void ogretmenBilgi(){
        this.ogretmen.print();
    }
}
