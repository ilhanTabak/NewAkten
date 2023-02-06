package gunler.gun75_cuma03.animal;

import javax.crypto.spec.PSource;

public class Frog extends Animal implements CanSwim{


    public Frog(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    @Override
    void move() {


        System.out.println("i am frog and I can jump");

    }

    @Override
    void makeSound() {

        System.out.println("I am frog and I vrag vrag");

    }

    @Override
    void eat() {


        System.out.println("I am a frog and i eat insect");

    }

    @Override
    public void canSwim() {

        System.out.println("i am a frog,I can swim");
    }
}
