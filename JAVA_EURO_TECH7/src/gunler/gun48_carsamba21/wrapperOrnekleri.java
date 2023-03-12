package gunler.gun48_carsamba21;

public class wrapperOrnekleri {
    public static void main(String[] args) {

        int num1=5;

        Integer num2=new Integer(5);
        Integer num3=new Integer("5");
        Integer num4=new Integer(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //==referanslari karsilastirir
        //equals metotu objectlerin degerlerini karsilastirir

        System.out.println(num2==num3);
        System.out.println(num2.equals(num3));

        double d1=25.5;
        double d2=new Double(25.5);
        double d3=new Double("25.5");
        Double d4=new Double(d1);

        System.out.println(d1+d2+d3+d4);

        char c1='c';
        Character c2=new Character('c');
        Character c3=new Character(c1);

        byte b1=10;
        Byte b2=new Byte((byte) 10);//byte ranginde bir value argumant olarak cast edilmesi gerekir
        Byte b3=new Byte("10");
        Byte b4=new Byte(b1);

        boolean bol1=true;
        Boolean bol2=new Boolean(false);
        Boolean bol3=new Boolean("false");
        Boolean bol4=new Boolean(bol1);




    }
}
