package gunler.gun58_persembe12;

public class CountryTest {

    public static void main(String[] args) {



        Countries country1=new Countries("Turkiye","TR",90);
        Countries country2=new Countries("Almanya","D",49);
        Countries country3=new Countries("ABD","USA",1);
        Countries country4=new Countries("Ingiltere","GB",48);


        System.out.println(country1);
        System.out.println(country2);
        System.out.println(country3);
        System.out.println(country4);

        System.out.println(Countries.coutryCount);

        System.out.println(Countries.coutryCount);

        country4.coutryCount=245;
        System.out.println(Countries.coutryCount);

    }
}
