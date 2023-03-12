package gunler.gun45_cuma16;

public class FrequencyOfChar {




        public static void main(String[] args) {

            // String icerisinde tekrar edilen karakterlerin adedini donduren bir method yaziniz
            // "AAACDDDWCEFQ" ==> "A3C2D3W1E1F1Q1"

            String uniqueCountedString = frequencyOfChar("AAACDDDWCEFQ");
            System.out.println(uniqueCountedString);

            System.out.println(frequencyOfChar("hhhiiiwwwcccyaooheef"));

        }
        public static String frequencyOfChar(String str){
            String result = "";
            for(int i=0; i<str.length(); i++){
                if(!result.contains("" + str.charAt(i))){
                    result += str.charAt(i);
                }
            }

            String expectedString = "";
            for(int i=0; i<result.length(); i++){
                int counter = 0;
                for(int j=0; j<str.length(); j++){
                    if(result.charAt(i)==str.charAt(j)){
                        counter++;
                    }
                }
                expectedString += result.charAt(i) + "" + counter;
            }
            return expectedString;
        }
    }











