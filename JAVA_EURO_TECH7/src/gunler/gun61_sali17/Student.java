package gunler.gun61_sali17;

public class Student {

    private String name;
    private int schoolNumber;
    private String division;

    private int age;

    private String lastName;


    public Student(){



    }


    public Student(String name, String division, int age) {
        this.name = name;
        this.division = division;
        this.age = age;
    }

    public boolean isimduzenle(String name) {

        this.name = name.toUpperCase();

        for (int i = 0; i <name.length() ; i++) {

            if(Character.isLetter(name.charAt(i))!=true){


                System.out.println("ogrenci adi icerisinde harf olmayan bir karakter var");

        }
    }
      return false;

    }

    public String isimGoster() {


        return this.name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {

        if (age > 18 && age < 60) {


            this.age = age;
        } else {

            System.out.println("yas uygun degil");

            this.age=18;
        }


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", division='" + division + '\'' +
                ", age=" + age +
                '}';
    }
}

