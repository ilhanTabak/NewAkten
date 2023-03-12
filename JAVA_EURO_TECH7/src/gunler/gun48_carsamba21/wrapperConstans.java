package gunler.gun48_carsamba21;

public class wrapperConstans {

    public static void main(String[] args) {


      //bir array icerisinde ki an buyuk arrayi bulanbir metot yaziniz

        int[]numbers={131251,897923,87238,98,981271};


    }

    public static int maxValue(int[]arr){

        Integer max=Integer.MIN_VALUE;
        for (Integer each:arr
             ) {
            if(each>max){

                max=each;
            }

        }
        return max;
    }






}
