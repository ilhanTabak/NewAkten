package gunler.gun10_cuma28;

import java.util.Scanner;

public class if_statment {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("oyundan cikmak istiyorsaniz ,Press Q veya q");

        String deger= scan.next();

        if(deger.equals("q")|| deger.equals("Q")){
            System.out.println("oyundan cikiyorsunuz");}

                    else{
                System.out.println("hala oyundasiniz");
            }

      }

    }

