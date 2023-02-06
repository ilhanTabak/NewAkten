package gunler.gun75_cuma03.animal;

public abstract class Animal {


    private String name;
    private int age;
    private String color;
    private int weight;

    public Animal(String name, int age, String color, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;





    }

    abstract void move();


    abstract void makeSound();



    abstract void eat();






    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
