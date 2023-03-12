package gunler.gun70_cuma27;

import java.util.Scanner;

public class TAlhaHocaAntrenman {
    public static void main(String[] args) {
        
        
        boolean buyukHarf=false;
        boolean kucukHarf=false;
        boolean digit=false;
        boolean special=false;
        
        
        Scanner scan=new Scanner(System.in);


        System.out.println("lutfen bir sifre olusturunuz");
        
        String sifre =scan.next();

        if(sifre.length()<8||sifre.length()>14){

            System.out.println("sifre 8 ile 14 karakter arasinda olmalidir");
        }


        for (int i = 0; i < sifre.length(); i++) {

            if(Character.isUpperCase(sifre.charAt(i))){

                buyukHarf=true;
            }
            if(Character.isLowerCase(sifre.charAt(i))){


                kucukHarf=true;
            }
            if(Character.isDigit(sifre.charAt(i))){

                digit=true;
            }

           if(Character.isSpaceChar(sifre.charAt(i))){

               special=true;

           }

        }

        if(!buyukHarf){

            System.out.println("sifre en az bir buyuk harf icermelidir");
        }
        if(!kucukHarf){

            System.out.println("sifre en az bir kucuk harf icermelidir");
        }
        if(!digit){

            System.out.println("sifre en az bir rakam icermelidir");
        }
        if(!buyukHarf){

            System.out.println("sifre en az bir oyel karakterd icermelidir");
        }

    }


    
    

}
