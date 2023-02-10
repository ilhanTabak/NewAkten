package gunler.gun79_persmebe09;

public class ExceptionHandling {
    public static void main(String[] args) {


        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);


        } catch (ArithmeticException e) {


            e.printStackTrace();


        }
        System.out.println("kod funktionert");
    }
}