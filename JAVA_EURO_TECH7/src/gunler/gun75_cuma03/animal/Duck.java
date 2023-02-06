package gunler.gun75_cuma03.animal;

public class Duck extends Animal implements CanFly,CanSwim{
    public Duck(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }


    @Override
    void move() {


        System.out.println("i am duck and I can run");

    }

    @Override
    void makeSound() {

        System.out.println("I am duck and I vak vak");

    }

    @Override
    void eat() {


        System.out.println("I am a duck and i eat bread");

    }


    public void CanFly(){


        System.out.println("I am duck I can fly");

    }


    @Override
    public void canSwim() {
        System.out.println("I am duck I can swim");
    }
}
