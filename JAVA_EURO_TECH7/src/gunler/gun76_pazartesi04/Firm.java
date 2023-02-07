package gunler.gun76_pazartesi04;

import java.util.ArrayList;

public class Firm {

    private String name;
    private String address;
    private String webAdress;
    private ArrayList<Person> firmWorkers;

    public Firm(String name, String address, String webAdress) {
        this.name = name;
        this.address = address;
        this.webAdress = webAdress;
        this.firmWorkers = new ArrayList<>();}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebAdress() {
        return webAdress;
    }

    public void setWebAdress(String webAdress) {
        this.webAdress = webAdress;
    }

    public ArrayList<Person> getFirmWorkers() {
        return firmWorkers;
    }


    public void addWorkers(Person person){


        this.firmWorkers.add(person);
    }

    public void addWorkers(Person...persons){

        for(Person person1:persons){


            this.firmWorkers.add(person1);
        }

    }




    public void listWorker(){

       System.out.println("mitarbeiterlist");

       for(Person person:firmWorkers){

           System.out.println(person.showInfo());

       }





   }


   public void printInfo(){

        int numberOfEnginerr=0;
        int numberOfLehrer=0;
        int numberOfWorker=0;

       System.out.println("fabrik name:"+this.getName());
       System.out.println("fabrik adress"+this.getAddress());
       System.out.println("fabrik webAdresse"+this.getWebAdress());

       for(Person person:firmWorkers){

           if(person instanceof Engineer){


               numberOfEnginerr++;
           }
           if(person instanceof Lehrer){


               numberOfLehrer++;

           }
           if(person instanceof Worker){

               numberOfWorker++;
           }



       }

       System.out.println("personel von fabrik");

       System.out.println("--------------------");

       System.out.println("engineer"+numberOfEnginerr);
       System.out.println("lehrer"+numberOfLehrer);
       System.out.println("worker"+numberOfWorker);

   }

   public void personDoWork(){


        for (Person person:firmWorkers){


            person.work();

            if(person instanceof Engineer)((Engineer)person).design();
            if(person instanceof Lehrer)((Lehrer)person).teach();





            }
        }



    @Override
    public String toString() {
        return "Firm{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", webAdress='" + webAdress + '\'' +
                ", firmWorkers=" + firmWorkers +
                '}';
    }
}

