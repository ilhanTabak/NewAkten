package gunler.gun36_pazartesi05;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateClass {


    public static void main(String[] args) {

        LocalDate localdate=LocalDate.now();

        System.out.println(localdate);
        System.out.println(LocalDateTime.now());

        kisi hesapla=new kisi();
        hesapla.yasHesapla(1977);


    }



}
