package gunler.gun43_carsamba14;

public class TekrarEdenKarakter {


    public static void main(String[] args) {

        String str="ashdgfgfkskaa";
        String yeni="";
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));


            if (!yeni.contains(""+str.charAt(i))) {

                yeni=yeni+str.charAt(i);


            }



        }


        System.out.println(yeni);

    }
}
