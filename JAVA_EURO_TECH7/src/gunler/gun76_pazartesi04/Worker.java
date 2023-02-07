package gunler.gun76_pazartesi04;

public class Worker extends Person{


    private String department;


    public Worker(String name, int age, String department) {
        super(name, age);

        this.department=department;}


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(this.getName()+"ich arbeite Schichtarbeit");

    }

    @Override
    public String showInfo() {
        return this.getName()+"-"+this.getAge()+"Jahre alt"+getDepartment()+"arbeite";
    }

    public void arbeit(){

        System.out.println("ich arbeite taglich");
    }





    }







