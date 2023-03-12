package gunler.gun63_persembe19;

public class Inhareitance2 {

    public static void main(String[] args) {


        System.out.println("inheritance java");


        Bchild child=new Bchild();
        Bchild child2=new Bchild("child");
        child.setPrivateStr("test setter");
        System.out.println(child.getPrivateStr());

    }
}
