package gunler.gun48_carsamba21;

public class PrimitiveToWrapper {

    public static void main(String[] args) {


        int num=10;
        double num2=32.3;
        boolean b=true;

        Integer obj1=Integer.valueOf(num);
        Double obj2=Double.valueOf(num2);
        Boolean obj3=Boolean.valueOf(b);


        if(obj1 instanceof Integer){

            System.out.println(obj1+"dogru");
        }else{

            System.out.println(obj1+"yanlis");
        }




    }


}
