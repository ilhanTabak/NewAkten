package gunler.gun19_persembe10;

public class Ogrenci {

    int yas=16;
    String isim="duha";
    long para=1000;
    double not=100;

    void dogumgunukutla(){

        System.out.println("dogum gunu kutlaniyor");
        yas++;

    }

    void derscalis(){

        System.out.println("ders calisiyor");
        not+=10;
    }

    void burskazan(int burs){

        para+=burs;

    }

    void donerYe(){


        para-=10;
    }

    void bastir(){


    }


    public void printState() {
        System.out.println(isim+" "+yas+not+para);


    }
}


