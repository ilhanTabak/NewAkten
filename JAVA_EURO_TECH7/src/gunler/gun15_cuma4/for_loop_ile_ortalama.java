package gunler.gun15_cuma4;

import java.util.Scanner;

public class for_loop_ile_ortalama {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int toplam=0;

        for (int i = 1; i < 5; i++) {


            System.out.println("lutfen "+i+" inci ogrencinin numarasini giriniz");

             int not= scan.nextInt();

             toplam=toplam+not;
        }


        double ortalama=toplam/4;


        System.out.println("ortalama: "+ortalama);
          }

    }

