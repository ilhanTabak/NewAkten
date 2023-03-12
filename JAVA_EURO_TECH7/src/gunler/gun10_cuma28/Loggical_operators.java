package gunler.gun10_cuma28;

public class Loggical_operators {

    public static void main(String[] args) {

        /*logical operators=used to connect two or more be true

        &&=(AND) both conditions must be true
        ||=(OR)either condition must be true
        !=(NOT) reverses boolean value of condition
         */
        int temp=25;

        if(temp>30){
            System.out.println("it is hot outside");
        }

        else if(temp>20&&temp<30){
            System.out.println("it is warm outside");
        }

        else{
            System.out.println("it is cold outside");

        }





    }

}
