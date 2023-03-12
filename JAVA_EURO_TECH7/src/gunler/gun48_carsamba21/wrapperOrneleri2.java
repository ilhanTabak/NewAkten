package gunler.gun48_carsamba21;

public class wrapperOrneleri2 {


    public static void main(String[] args) {
        int num1=5;

        Integer num2=Integer.valueOf(5);
        Integer num3=Integer.valueOf("5");
        Integer num4=Integer.valueOf(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //==referanslari karsilastirir
        //equals metotu objectlerin degerlerini karsilastirir

        System.out.println(num2==num3);
        System.out.println(num2.equals(num3));

        double d1=25.5;
        double d2=Double.valueOf(25.5);
        double d3=Double.valueOf("25.5");
        Double d4=Double.valueOf(d1);

        System.out.println(d1+d2+d3+d4);

        char c1='c';
        Character c2=Character.valueOf('c');
        Character c3=Character.valueOf(c1);

        byte b1=10;
        Byte b2=Byte.valueOf((byte) 10);//byte ranginde bir value argumant olarak cast edilmesi gerekir
        Byte b3=Byte.valueOf("10");
        Byte b4=Byte.valueOf(b1);

        boolean bol1=true;
        Boolean bol2=Boolean.valueOf(false);
        Boolean bol3=Boolean.valueOf("false");
        Boolean bol4=Boolean.valueOf(bol1);

        float f1=25.5f;
        Float f2=Float.valueOf(25.5F);
        Float f3=Float.valueOf("25.5");
        Float f4=Float.valueOf(f1);

    }
}
