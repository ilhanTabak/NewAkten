package gunler.gun59_cuma13;

public class Test {


    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(12,23);

        System.out.println(rectangle.getLenght());
        System.out.println(rectangle.getBreit());


        rectangle.setBreit(24);
        rectangle.setLenght(13);

        System.out.println(rectangle.alan(rectangle.getLenght(),rectangle.getBreit()));

    }



}
