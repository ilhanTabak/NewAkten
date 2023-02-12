package gunler.gun44_persembe15;

public class Employee {

    private String name;
    private String nachName;
    private double salary;

    public Employee(String name, String nachName, double salary) {
        this.name = name;
        this.nachName = nachName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double zamliMaas(Double salary){

        this.salary=salary;

        return salary+salary*0.10;



    }
}
