package gunler.gun59_cuma13;

public class Job {


    private String title;
    private String company;
    private double salary;

    public Job(){
        System.out.println("no argument constracter");

        this.title="undefinder";
        this.company="undefinder";

    }

    public Job(String title){

        System.out.println("onr argument constracter");

        this.title=title;
        this.company="undefined";
    }

    public Job(String title,String company,double salary ){


        System.out.println("three argument constrocter");

        setTitle(title);
        setCompany(company);
        this.salary=salary;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
