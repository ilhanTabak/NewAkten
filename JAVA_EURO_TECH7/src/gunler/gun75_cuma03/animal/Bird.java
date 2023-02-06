package gunler.gun75_cuma03.animal;

public class Bird extends Animal implements CanFly{


    public Bird(String name, int age, String color, int weight) {
        super(name, age, color, weight);
    }


    @Override
    void move() {


        System.out.println("i am bird and I can run");

    }

    @Override
    void makeSound() {

        System.out.println("I am bird and I cik cik");

    }

    @Override
    void eat() {


        System.out.println("I am a bird and i eat corn");

    }

    public void CanFly(){
       System.out.println("I am duck I can fly");

}
}
