package gunler.gun76_pazartesi04;

public class Engineer extends Person{


    private String universitad;

    public Engineer(String name,int age,String universitad){

        super(name,age);
        this.universitad=universitad;

    }


    public String getUniversitad() {
        return universitad;
    }

    public void setUniversitad(String universitad) {
        this.universitad = universitad;
    }

    @Override
    public void work() {

        System.out.println(this.getName()+"Er arbeitet als Engineer  in diesem Fabrik");

    }

    @Override
    public String showInfo() {
        return this.getName()+"-"+this.getAge()+"Jahre alt"+getUniversitad()+"abgeschlossen";
    }

    public void design(){

        System.out.println("ich bin ein Engineer und ich baue etwas");
    }



}
