package gunler.gun76_pazartesi04;

public class FabrikAplication {

    public static void main(String[] args) {

        Firm fabrik=new Firm("SDET Fabrik","ABC Gebaude","www.fgh.com");

        System.out.println(fabrik);


        Person engineer1=new Engineer("ali",23,"Marmara");
        Person engineer2=new Engineer("ayse",25,"Istanbul");

        Person lehrer1=new Lehrer("mustafa",25);
        Person lehrer2=new Lehrer("marry",26);

        Person worker1=new Worker("ahmet",56,"anmeldung");
        Person worker2=new Worker("cemil",14,"marketing");
        Person worker3=new Worker("kamil",35,"produkt");
        Person worker4=new Worker("eyel",48,"lage");
        Person worker5=new Worker("ishak",45,"lieferung");



        Person isciOzel=new WorkerCanDrive("arbeiter kann fahren",45,"lieferung");


        fabrik.addWorkers(engineer1);
        fabrik.addWorkers(engineer2);

        fabrik.addWorkers(lehrer1,lehrer2,worker1,worker2,worker3,worker4,worker5,isciOzel);
        fabrik.listWorker();

        fabrik.toString();
        fabrik.printInfo();
        fabrik.personDoWork();







    }
}
