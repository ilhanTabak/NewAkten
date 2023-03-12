package gunler.gun63_persembe19;

public class Bchild extends Aparent{

    String name;

    Bchild(){
        super();//Base class constracter


        System.out.println("child class constracter");


    }

  Bchild(String name){

        this();//Sub class constracter.

      this.name=name;

  }

  public void aMethodChild(){


        super.parentField="Assigment from child class";
        super.ParentInt=10;
        super.setPrivateStr("sub class setter assigmnet");
  }



    }




