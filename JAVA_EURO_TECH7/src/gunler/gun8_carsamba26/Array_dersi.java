package gunler.gun8_carsamba26;

public class Array_dersi {

    public static void main(String[] args) {

        int[] schrank = {1, 2, 3, 4, 5, 6};
        //yukarida ki ifade int schrank[]={1,2,3,4,5,6}; olarak ta yazilabilir.
        System.out.println("Wert an Position 1:" + schrank[0]);

        int lange = schrank.length;

        System.out.println("Lange Array " + lange);

        System.out.println("Wert an Position 4:" + schrank[3]);

        String[] array=new String[4];

        array[0]="Hallo";
        array[1]="du";
        array[2]="bist";
        array[3]="cool";
        for (int i = 0; i <array.length ; i++) {

            System.out.print(array[i]+" ");


        }
    }
}
