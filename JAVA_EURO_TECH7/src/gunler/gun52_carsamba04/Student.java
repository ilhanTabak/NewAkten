package gunler.gun52_carsamba04;

public class Student {


    int schoolNumber;
    String name;
    String country;
    String city;

    public Student() {


        System.out.println("Defoult constracter invoked");
    }

    public Student(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public Student(int schoolNumber, String name) {

        this.schoolNumber=schoolNumber;
       // this.schoolNumber = schoolNumber;
        this.name = name;
    }

    public Student(int schoolNumber, String name, String country) {
        this(schoolNumber,name);
        //this.schoolNumber = schoolNumber;
       // this.name = name;
        this.country = country;
    }

    public Student(int schoolNumber, String name, String country, String city) {
        this(schoolNumber,name,country);
      //  this.schoolNumber = schoolNumber;
        //this.name = name;
        //this.country = country;
        this.city = city;
    }


    public String toString(){

        String str="";
        str +="Okul no          :"+this.schoolNumber+"\n";
        str +="Ögrencinin adi    :"+this.name+"\n";
        str +="ögrencinin ulkesi: "+this.country+"\n";
        str +="ogrencini sehri    "+this.city+"\n";

        return str;

    }



}
