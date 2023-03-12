package gunler.gun36_pazartesi05;

import gunler.gun33_carsamba30.Banka;

public class MatematikTest {

    public static void main(String[] args) {
        Matematik islem = new Matematik();
        islem.toplama(40, 60);
        double carpmaSonuc = islem.carpma(10, 30);
        System.out.println("carpmaSonuc = " + carpmaSonuc);
        double besUssu = islem.karesi(5, 5);// 5 5 5 5 5
        System.out.println("besUssu = " + besUssu);

        Banka banka=new Banka();




    }
}










