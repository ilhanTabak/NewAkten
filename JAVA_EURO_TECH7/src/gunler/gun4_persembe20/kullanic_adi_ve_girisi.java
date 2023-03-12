package gunler.gun4_persembe20;

import java.util.Scanner;

public class kullanic_adi_ve_girisi {
    public static void main(String[] args) {

        /*String sys_kul_adi = "yazilimbilimi";
        String parola = "12345";
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanici adi:");

        String kullanici_adi=scan.nextLine();

        System.out.println("Parola:");
        String parola1=scan.nextLine();

        System.out.println(("kullanici_adi"=="sys_kul_adi")&&("parola"=="parola1"));*/

        String sys_kul_adi = "yazilimbilimi";
        String parola = "12345";
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanici adi:");

        String kullanici_adi = scan.nextLine();

        System.out.println("Parola:");
        String parola1 = scan.nextLine();
        if (!(sys_kul_adi.equals(kullanici_adi))&&!(parola.equals(parola1))){
            System.out.println("hatali");

    }
        else if ((sys_kul_adi.equals(kullanici_adi)) && (parola.equals(parola1)))
        {
            System.out.println("basarili");


        }
    }


}



