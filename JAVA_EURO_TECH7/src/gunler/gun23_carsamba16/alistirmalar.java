package gunler.gun23_carsamba16;

public class alistirmalar {

    public static void main(String[] args) {

         Product calisma=new Product();

         calisma.isim="Laptop";
         calisma.urunFiyati=2000;
         calisma.urunMiktari=20;


         ProductMnager productMnager=new ProductMnager();


        productMnager.Add(calisma);




    }




}
