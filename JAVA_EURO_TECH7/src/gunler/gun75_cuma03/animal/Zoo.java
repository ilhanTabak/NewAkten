package gunler.gun75_cuma03.animal;

import java.util.ArrayList;

public class Zoo {

    private String name;
    private String Address;

    private ArrayList<Cat> cats;
    private ArrayList<Dog> dogs;
    private ArrayList<Duck>ducks;
    private ArrayList<Bird>birds;

    private ArrayList<Animal> animals;
    private ArrayList<CanFly>animalsCanfly;
    private ArrayList<CanSwim> animalCanSwim;

    public Zoo(String name, String address) {
        this.name = name;
        Address = address;
        this.animals=new ArrayList<>();
        this.animalsCanfly=new ArrayList<>();
        this.dogs=new ArrayList<>();
    }

    public void addAnimal(Animal animal){

        this.animals.add(animal);
    }
    public ArrayList<Animal>animalList(){

        return animals;

    }

    public void printAnimal(){

        for(Animal animal:animals){

            System.out.println(animal);

            if(animal instanceof Bird){

                ((Bird)animal).CanFly();
            }
            if(animal instanceof CanSwim){
                ((CanSwim) animal).canSwim();

            }

        }

    }


    public void addFlyableAnimals(CanFly canFlyanimals){

        this.animalsCanfly.add(canFlyanimals);


    }

    public void printCanflyAnimals(){

        for(CanFly flyy:animalsCanfly){

            System.out.println(flyy);

        }


    }

    }



