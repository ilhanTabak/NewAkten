package gunler.gun45_cuma16;

public class RemoveDublicTED {

    public static void main(String[] args) {


      String uniq=removeDublicated("hdhfgfgfgdhdhdgdfghfhd");
        System.out.println(uniq);

    }
    public static String removeDublicated(String str){

        String result="";
        int sayac;

        for (int i = 0; i <str.length(); i++) {

            if(result.contains(""+str.charAt(i))) {
                result+=str.charAt(i);

            }

        }

       return result;



            }




            }













