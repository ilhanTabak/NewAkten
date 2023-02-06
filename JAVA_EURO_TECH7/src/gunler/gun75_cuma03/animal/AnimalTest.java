package gunler.gun75_cuma03.animal;

public class AnimalTest {


    public static void main(String[] args) {


        Cat cat=new Cat("mahur",4,"gray",5);

        System.out.println("cat = " + cat);

        cat.makeSound();
        cat.move();
        cat.canSwim();

        Dog dog=new Dog("karabas",25,"black",14);

        dog.makeSound();

        Animal animal=new Cat("pisp",5,"mor",8);
        Animal animal1=new Dog("kucu",8,"beyaz",6);

        animal.makeSound();


        animal=new Bird("fafa",7,"kirmizi",6);

        animal.makeSound();

        Zoo zoo=new Zoo("hjhsd","ankara");

        zoo.addAnimal(animal);
        zoo.addAnimal(animal1);

        zoo.printAnimal();

        zoo.addAnimal(new Duck("kuzu",5,"dte",9));

        CanFly canFly=new Bird("kus",2,"sari",6);
        zoo.addFlyableAnimals(canFly);


        zoo.addFlyableAnimals((Bird)animal);



        zoo.printCanflyAnimals();
        System.out.println("animal.getClass() = " + animal.getClass());


    }






}
