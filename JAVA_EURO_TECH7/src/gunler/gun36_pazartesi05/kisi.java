package gunler.gun36_pazartesi05;

import java.time.LocalDate;

public class kisi {

    int yas;






    public void yasHesapla(int year){

        LocalDate localDate=LocalDate.now();
        int yas=localDate.getYear()-year;

        System.out.println(yas);






    }



}
