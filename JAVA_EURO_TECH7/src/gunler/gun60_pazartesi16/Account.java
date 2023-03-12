package gunler.gun60_pazartesi16;

public class Account {

    private long acc_number;
    private String name;
    private String email;
    private double emount;
    private String adress;
    private String phoneNumber;


    public long getAcc_number() {
        return acc_number;
    }

    public void setAcc_number(long acc_number) {
        this.acc_number = acc_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getEmount() {
        return emount;
    }

    public void setEmount(double emount) {
        this.emount = emount;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acc_number=" + acc_number +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", emount=" + emount +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
