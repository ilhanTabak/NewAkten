package gunler.gun62_carsamba18;

public class Parent extends GrandParent {

    String lastName;


    public Parent(String name,String lastName){

        super(name);

        this.lastName=lastName;



    }

    public void display(){
        super.displyy();

        System.out.println("last nameof parents is");
    }

}
