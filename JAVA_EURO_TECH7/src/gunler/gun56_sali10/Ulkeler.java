package gunler.gun56_sali10;

public class Ulkeler {


    //Static vaiables-Class variables

    static int ulkelersayac;
    //Instance vaiables

    int dummyCounter;
    String name;
    String ulkeKodu;
    int intTelefonCode;

    public Ulkeler(String name, String ulkeKodu, int intTelefonCode) {

        ulkelersayac++;
        dummyCounter++;


        this.name = name;
        this.ulkeKodu = ulkeKodu;
        this.intTelefonCode = intTelefonCode;
    }


    public String toString() {
        return "Ulkeler{" +
                "dummyCounter=" + dummyCounter +
                ", name='" + name + '\'' +
                ", ulkeKodu='" + ulkeKodu + '\'' +
                ", intTelefonCode=" + intTelefonCode +
                '}';
    }
}
