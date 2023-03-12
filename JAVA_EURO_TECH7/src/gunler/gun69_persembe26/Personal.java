package gunler.gun69_persembe26;

import java.util.Scanner;

public class Personal {


    private String vorName;
    private String NachName;
    private String eMail;
    private int dogumYili;

    static int counter=0;


    public Personal() {


        counter++;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return NachName;
    }

    public void setNachName(String nachName) {
        NachName = nachName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public static void main(String[] args) {


    }

    public void mailTest(String eMail){

        this.eMail=eMail;
        if(eMail.contains("@")){

            System.out.println("gecerli e mail");
        }else{

            System.out.println("gecersiz email");
        }

    }
    public int getYas(int dogumYili){

        this.dogumYili=dogumYili;

        return 2023-dogumYili;


    }


    public void adSoyad(String vorName,String nachName){


        System.out.println(vorName+nachName);

    }

    @Override
    public String toString() {
        return "Personal{" +
                "vorName='" + vorName + '\'' +
                ", NachName='" + NachName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", dogumYili=" + dogumYili +
                '}';
    }
}















