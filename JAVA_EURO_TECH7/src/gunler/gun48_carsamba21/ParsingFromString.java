package gunler.gun48_carsamba21;

public class ParsingFromString {


    public static void main(String[] args) {

        String stringNumber="2022";
        int number=Integer.valueOf(stringNumber);
        int number2=Integer.parseInt(stringNumber);

        System.out.println("number="+number);
        System.out.println("number2 = " + number2);

        number=number+number2;
        System.out.println("number="+number);

        String str="2022A";

        int number4=Integer.parseInt(str);

        System.out.println("number4="+number4);
        //error/number format excaption


    }
}
