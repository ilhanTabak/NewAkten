package gunler.gun70_cuma27;

public class EvTest {
    public static void main(String[] args) {


        Cati cati=new Cati(23,"beyaz");
        Mutfak mutfak=new Mutfak("kedi",56,5,"tahta");
        Bahce bahce=new Bahce("tas",3,"iyi",true);
        Oda oda=new Oda(new MisafirOdasi("mavi"),new YatakOdasi("beyaz"),new CocukOdasi("Sari"),new OturmaOdasi("mor"));

        Ev ev=new Ev(oda,cati,mutfak,bahce,"guzel evim");



    }
}
