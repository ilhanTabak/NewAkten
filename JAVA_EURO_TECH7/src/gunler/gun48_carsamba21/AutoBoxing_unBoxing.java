package gunler.gun48_carsamba21;

public class AutoBoxing_unBoxing {
    public static void main(String[] args) {

        Integer num1=123;

        int num2=12;

        Integer num3=num2;

        System.out.println("num3 "+num3);
        System.out.println("num2 "+num2);
        System.out.println("num1 "+num1);

        //unboxing --->wrapper to primitive

        Double d1=Double.valueOf(23.5);
        double d2=d1;

        System.out.println("d1"+d1);
        System.out.println("d2"+d2);

        int number1=new Integer(123);  //unboxing yapilis oldu
        Integer number2=new Integer(123);  //no boxing
        int number3=number2;   //unboxing
        Integer number4=Integer.valueOf(345);
        //Double number5=number4     //bu sekilde bir casting mumkun degil





    }
}
