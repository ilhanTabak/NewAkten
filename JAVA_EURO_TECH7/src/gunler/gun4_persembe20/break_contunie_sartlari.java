package gunler.gun4_persembe20;

import java.util.Scanner;

public class break_contunie_sartlari {


    public static void main(String[] args) {

      Scanner scan=new Scanner(System.in);



      while(true){

          System.out.println("bir sayi giriniz");

          int sayi=scan.nextInt();

          if(sayi%7==0){

              break;

          }

          System.out.println(sayi);

      }


        }
    }

