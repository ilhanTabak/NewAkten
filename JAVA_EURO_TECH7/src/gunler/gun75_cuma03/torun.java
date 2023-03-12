package gunler.gun75_cuma03;

public class torun extends baba {


    String okul;
    int yas;


    public torun(double tall, int gewicht, String sacrengi, String gozrengi, String okul, int yas) {
        super(tall, gewicht, sacrengi, gozrengi);
        this.okul = okul;
        this.yas = yas;
    }




    public void torun(){

        super.baba();
        System.out.println("ben torunum");


    }
}
