package gunler.gun76_pazartesi04;

public class Lehrer extends Person{


    public Lehrer(String name, int age) {
        super(name, age);
    }


    @Override
    public void work() {

        System.out.println(this.getName()+"Er arbeitet als Lehrer  in diesem Fabrik");

    }

    @Override
    public String showInfo() {
        return this.getName()+"-"+this.getAge()+"Jahre alt";
    }

    public void teach(){

        System.out.println("ich lehre etwas");
    }
}
