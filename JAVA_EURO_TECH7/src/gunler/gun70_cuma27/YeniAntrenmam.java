package gunler.gun70_cuma27;

public class YeniAntrenmam {

    public static void main(String[] args) {
        String abc="aaabbbcccddefg";
        int counter=0;

        int k=1;
        int j=1;



        for (int i = 0; i <abc.length()-1 ; i++) {

            counter=0;
            k++;


            for (j = k; j <abc.length()-1 ; j++) {


                if(abc.charAt(i)==abc.charAt(j)){


                    counter++;

                }


            }

            if(counter==0){

                System.out.println(abc.charAt(i));
            }

        }
    }
}
