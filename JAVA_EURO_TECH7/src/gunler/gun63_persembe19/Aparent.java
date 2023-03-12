package gunler.gun63_persembe19;

public class Aparent {



    String parentField;
    int ParentInt;

    private String privateStr;


    Aparent(){


        System.out.println("super class constracter");

    }

    public void setPrivateStr(String str){

        this.privateStr=str;
    }

    public String getPrivateStr(){

        return privateStr;
    }
    public void aMethod(){


        System.out.println("i am a method for super/parent class");

    }


}
