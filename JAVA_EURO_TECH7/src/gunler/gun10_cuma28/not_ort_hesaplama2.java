package gunler.gun10_cuma28;

import java.util.Scanner;

public class not_ort_hesaplama2 {

    public static void main(String[] args) {


        int quiz,vize,ffinal;

        double ortalama;

        Scanner scan=new Scanner(System.in);

        System.out.println("quiz notu giriniz= ");

        quiz= scan.nextInt();

        System.out.println("vize notu giriniz= ");

        vize=scan.nextInt();

        System.out.println("final notu giriniz= ");

        ffinal= scan.nextByte();

        ortalama=(quiz+vize+ffinal)/3;

        System.out.println("not ortalamaniz= "+ortalama);

        String sonuc=(ortalama>=50)?"gectiniz":"kaldiniz";
        System.out.println(sonuc);


    }
}
