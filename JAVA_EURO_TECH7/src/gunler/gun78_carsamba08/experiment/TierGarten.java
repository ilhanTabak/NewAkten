package gunler.gun78_carsamba08.experiment;



        import java.util.ArrayList;

public class TierGarten {

    String tierGartenName;
    String adresse;

    ArrayList<Tier> tiers = new ArrayList<Tier>();


    public TierGarten(String tierGartenName, String adresse, ArrayList<Tier> tiers) {
        this.tierGartenName = tierGartenName;
        this.adresse = adresse;
        this.tiers = tiers;

    }


    @Override
    public String toString() {
        return "TierGarten{" +
                "tierGartenName='" + tierGartenName + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tiers=" + tiers +
                '}';
    }

    public static void addTier(Tier... tier) {

        for (Tier tierl : tier){


        }




    }





        }




