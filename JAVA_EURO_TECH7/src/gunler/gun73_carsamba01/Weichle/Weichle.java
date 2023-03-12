package gunler.gun73_carsamba01.Weichle;

public abstract class Weichle {


    protected String color;
    protected int reifen;



    public abstract void drive();


    public void color(String color){

        this.color=color;

        System.out.println("aracin rengi"+color+"dur");

    }


}
