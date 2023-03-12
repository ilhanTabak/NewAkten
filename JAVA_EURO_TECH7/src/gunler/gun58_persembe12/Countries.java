package gunler.gun58_persembe12;

public class Countries {



    String countryName;
    String countrCode;
    int telCode;

    int dummyCounter;

    static int coutryCount;

    public Countries(String countryName, String countrCode, int telCode) {
        coutryCount++;
        dummyCounter++;
        this.countryName = countryName;
        this.countrCode = countrCode;
        this.telCode = telCode;

    }

    @Override
    public String toString() {
        return "Countries{" +
                "countryName='" + countryName + '\'' +
                ", countrCode='" + countrCode + '\'' +
                ", telCode=" + telCode +
                ", dummyCounter=" + dummyCounter +
                '}';
    }
}
