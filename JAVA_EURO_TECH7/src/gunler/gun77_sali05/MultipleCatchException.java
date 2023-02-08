package gunler.gun77_sali05;

public class MultipleCatchException {

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3};
        try {

            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println(result);

            System.out.println(numbers[5]);
        } catch (ArithmeticException a) {


            System.out.println("can not divide zero");
            a.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("array index out of bound");
        }

    }
}