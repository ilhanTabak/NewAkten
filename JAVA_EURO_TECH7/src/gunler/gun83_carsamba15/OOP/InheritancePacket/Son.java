package gunler.gun83_carsamba15.OOP.InheritancePacket;

public class Son extends Father{

    String gender;
    int schuheNummer;

    public Son(int gewicht, int tall, String name, int age, String gender, int schuheNummer) {
        super(gewicht, tall, name, age);
        this.gender = gender;
        this.schuheNummer = schuheNummer;
    }


    public String toString(){

        return "Name= "+name+" Age "+age+" gewicht "+gewicht+" gender= "+gender+" SchuheNummer= "+schuheNummer+" tall= "+tall;

    }




}
