package gunler.gun75_cuma03.animal;

public class Cat extends Animal implements CanSwim{


    public Cat(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }

    @Override
    void move() {


        System.out.println("i am cat and I can run");

    }

    @Override
    void makeSound() {

        System.out.println("I am cat and I miyav miyav");

    }

    @Override
    void eat() {


        System.out.println("I am a cat and i eat milk");

    }

    public void canSwim(){
        System.out.println("I am cat I can swim");

    }


}
