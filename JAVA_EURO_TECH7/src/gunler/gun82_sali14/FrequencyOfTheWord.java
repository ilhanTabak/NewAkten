package gunler.gun82_sali14;


import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfTheWord {

    public static void main(String[] args) {

        // Liste olarak verilen kelimelerin kac kez tekrarlandigini bulan ve
        // bu degerleri map object ile eslestiren bir code yaziniz

        String[] words = {"apple", "banana", "cherry", "apple", "banana", "apple"};

        Map<String,Integer> wordCount = new LinkedHashMap<>();

        for(String word : words){
            Integer count = wordCount.get(word);
            if(count == null){
                count = 0;
            }
            wordCount.put(word, count + 1);
        }
        System.out.println("wordCount = " + wordCount);
    }
}