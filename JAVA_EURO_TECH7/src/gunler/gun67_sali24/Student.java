package gunler.gun67_sali24;

import gunler.gun65_pazartesi23.Person;

public class Student extends Person {

    private String okulu;
    private String adresi;

    public Student(String okulu, String adresi) {
        this.okulu = okulu;
        this.adresi = adresi;
    }

    public String getOkulu() {
        return okulu;
    }

    public void setOkulu(String okulu) {
        this.okulu = okulu;
    }

    public String getAdresi() {
        return adresi;
    }

    public void setAdresi(String adresi) {
        this.adresi = adresi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "okulu='" + okulu + '\'' +
                ", adresi='" + adresi + '\'' +
                '}';
    }


}
