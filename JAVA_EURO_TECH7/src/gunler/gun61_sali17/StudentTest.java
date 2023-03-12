package gunler.gun61_sali17;

public class StudentTest {
    public static void main(String[] args) {

        Student ogr1=new Student("Ahmet","computerScience",12);

        System.out.println(ogr1);

        ogr1.isimduzenle("mehmet");

        System.out.println(ogr1);

        System.out.println(ogr1.isimGoster());

        ogr1.setAge(12);

        System.out.println(ogr1);

        Student ogr3=new Student();





    }
}
