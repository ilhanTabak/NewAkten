package gunler.gun75_cuma03.animal;

public class Dog extends Animal implements CanSwim{


    public Dog(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    @Override
    void move() {


        System.out.println("i am dog and I can run");

    }

    @Override
    void makeSound() {

        System.out.println("I am dog and I hav hav");

    }

    @Override
    void eat() {


        System.out.println("I am a dog and i eat meat");

    }

    public void canSwim(){
        System.out.println("I am dog I can swim");

    }


}
