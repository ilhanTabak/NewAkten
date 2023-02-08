package gunler.gun78_carsamba08.experiment;

import gunler.gun75_cuma03.animal.Animal;

public class TestClass {


    public static void main(String[] args) {


        Tier tier=new Hund("hav hav","schwarz",3,25);
        Tier tier1=new Katze("pisi","blau",5,12);

        TierGarten.addTier(tier,tier1);



    }
}
