package gunler.gun5_cuma21;

import java.util.Scanner;

public class kosuldurumlari {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Notunuzu Girin..");

        int note = scan.nextByte();

        if (note > 70) {
            System.out.println("Dersten gectiniz...");
        }
        else if (note<40) {
            System.out.println("Berbatsin");

        }
        else {
            System.out.println("Dersten kaldiniz");
        }
        }

    }
