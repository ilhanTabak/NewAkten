package gunler.gun52_carsamba04;

public class OtoparkProgrami {

    public static void main(String[] args) {

        OtoPark otoPark = new OtoPark("halk", "berlin");
        System.out.println("otoPark = " + otoPark);


        Car araba1 = new Car("BMW", "asd123");
        System.out.println("araba1 = " + araba1);

        Car araba2 = new Car("Mercedes", "wer456");
        System.out.println("araba2 = " + araba2);

        otoPark.arabaEkle(araba1);
        otoPark.arabaEkle(araba2);
        otoPark.arabaListesi();

    }


}
