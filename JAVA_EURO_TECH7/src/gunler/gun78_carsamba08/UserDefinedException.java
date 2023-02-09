package gunler.gun78_carsamba08;

import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) throws AgeException {
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        boolean devam = true;
        while (devam){
            System.out.print("Lütfen yaşınınızı giriniz : ");
            age = Integer.parseInt(scanner.nextLine());

            try {
                if(age < 18){
                    throw new AgeException("Yaşınız bu aracı kullanmaya uygun değildir.");
                    //   System.out.println("Yaşınız bu aracı kullanmaya uygun değildir.");
                } else {
                    devam = false;
                    System.out.println("Yaşınız bu aracı kullanmaya uygundur.");}

            }catch (AgeException yasExcp){
                System.out.println("Catch blok.");
                System.out.println(yasExcp.getMessage());
            }
        }

    }

}