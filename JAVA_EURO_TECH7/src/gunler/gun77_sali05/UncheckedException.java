package gunler.gun77_sali05;

public class UncheckedException {

    public static void main(String[] args) {


        //Unchecked exception
        //ClassCastException


        Object obj=new Object();

       // String str=new (String)obj;

     //Arithmetic exception
        System.out.println(1/0);



        //Array out of band exception

        int[ ]array={1,2,3,4,5};
        System.out.println(array[10]);

        //String out of bound exception

        String str="hello world";
        System.out.println(str.charAt(str.length()));

        //Null pointer exception

       // String str=null;
        //System.out.println(str.length());
    }


}
