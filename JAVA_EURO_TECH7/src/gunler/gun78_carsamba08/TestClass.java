package gunler.gun78_carsamba08;

public class TestClass {

    public static void main(String[] args) {


        Invoice artikel=new Invoice("123","fernsehen",5,1000);

        System.out.println(artikel);

        System.out.println(artikel.invoiceMethod(artikel.getPrice(), artikel.getPurchased()));

        Invoice artikel3=new Invoice("254","kühlschrank",4,9);

        System.out.println();

        artikel3.printArtikel();

        artikel.addArtikel(artikel,artikel3);

        artikel.printArtikel();
    }
}
