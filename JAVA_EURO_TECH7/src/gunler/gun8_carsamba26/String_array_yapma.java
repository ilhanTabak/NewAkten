package gunler.gun8_carsamba26;

import java.util.Arrays;

public class String_array_yapma {

    public static void main(String[] args) {

        String str="Hava cok guzel";

        String[]kelimeler=str.split("");
        System.out.println(Arrays.toString(kelimeler));

        //split metodu string karaktelrerini teker teker veya kelime kelime arraya donusturr.

    }
}
