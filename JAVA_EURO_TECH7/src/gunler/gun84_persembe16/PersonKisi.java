package gunler.gun84_persembe16;



public class PersonKisi {


    private int TCNO;
    private String name;
    private String adresse;


    public PersonKisi(int TCNO,String name,String adresse){

        this.TCNO=TCNO;
        this.name=name;
        this.adresse=adresse;


    }

    public int getTCNO(){

        return this.TCNO;
    }

    public void setTCNO(int TCNO){

        this.TCNO=TCNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "PersonKisi{" +
                "TCNO=" + TCNO +
                ", name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}

