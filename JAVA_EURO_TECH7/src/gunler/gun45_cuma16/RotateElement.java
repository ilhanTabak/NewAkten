package gunler.gun45_cuma16;

import java.util.Arrays;

public class RotateElement {

    public static void main(String[] args) {

        // Verilen bir arrayin elementlerini donduren bir method yaziniz
        // {1,2,3} ==> {2,3,1}

        int[] x = {1,2,3};
        int[] y = {14,22,35,12,41};
        int[] z = {0,5,0};

        int[] yenix = rotate(x);
        System.out.println(Arrays.toString(yenix));

        System.out.println(Arrays.toString(rotate(y)));

        System.out.println(Arrays.toString(rotate(z)));

    }

    public static int[] rotate(int[] arr){

        int ilkElement = arr[0];

        for(int i=0; i<=arr.length-2; i++){
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = ilkElement;

        return arr;
    }
}







