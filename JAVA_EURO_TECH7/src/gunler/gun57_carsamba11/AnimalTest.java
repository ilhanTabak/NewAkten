package gunler.gun57_carsamba11;

public class AnimalTest {


    public static void main(String[] args) {


        Animal animal=new Animal("kedi",3);

        System.out.println(animal.getSpecies());
        System.out.println(animal.getAge());


        animal.haveBirthday();
        System.out.println(animal.getAge());


    }
}
