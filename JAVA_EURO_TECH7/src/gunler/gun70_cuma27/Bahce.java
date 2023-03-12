package gunler.gun70_cuma27;

public class Bahce {


    private String zemin;
    private int cit;
    private String mangal;
    private boolean havuzVarmi;

    public Bahce(String zemin, int cit, String mangal, boolean havuzVarmi) {
        this.zemin = zemin;
        this.cit = cit;
        this.mangal = mangal;
        this.havuzVarmi = havuzVarmi;
    }

    public void sula(){


        System.out.println("bahce sulandi");
    }
}
