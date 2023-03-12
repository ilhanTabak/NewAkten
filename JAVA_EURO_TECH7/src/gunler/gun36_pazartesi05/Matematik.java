package gunler.gun36_pazartesi05;

public class Matematik {

    // toplama-carpma-cikarma-bolme   ---->double return type--->2 parametreli
    // bir sayinin karesini almak icin bir metod  ----> 1 parametreli int olsun ---->return int
    // iki sayidan buyuk-kucuk olani dondureleim--->iki int return type int

    public static void main(String[] args) {
        Matematik islem = new Matematik();
        islem.toplama(10, 20);
        Matematik operation = new Matematik();
        double toplama2 = operation.toplama(40, 50);
        System.out.println("toplama2 = " + toplama2);
        double carpmaSonuc = islem.carpma(5, 10);
        System.out.println("carpmaSonuc = " + carpmaSonuc);
        System.out.println(islem.carpma(20, 45));
        islem.karesi(15);
        islem.karesi(3, 4);// 3 3 3 3


    }

    public double toplama(int a, int b) {
        double toplam = a + b;
        System.out.println("toplam = " + toplam);
        return toplam;
    }

    public double carpma(int a, int b) {
        return a * b;
    }

    public double karesi(int a) {
        double karesi = a * a;
        System.out.println("karesi = " + karesi);
        return karesi;
    }

    public double karesi(int sayi, int ussu) {// 2     4
        double sonuc = 1;
        //              2
        // 2*2*2*2
        for (int i = 0; i < ussu; i++) {
            sonuc = sonuc * sayi;//
            //     1 * 3
            //     3 3
            //      9 3
            //       27 3
        }
        System.out.println("sonuc = " + sonuc);//1
        return sonuc;
    }


}



