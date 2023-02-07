package gunler.gun48_carsamba21;

public class CharacterMetot {


    public static void main(String[] args) {
        System.out.println("Character.isAlphabetic('c') = " + Character.isAlphabetic('c'));
        System.out.println("Character.isAlphabetic('c') = " + Character.isAlphabetic('8'));
        System.out.println("Character.isAlphabetic('c') = " + Character.isLetter('G'));
        System.out.println("Character.isAlphabetic('c') = " + Character.isDigit('c'));

        String str="Java2022";
        System.out.println(Character.isAlphabetic(str.charAt(6)));
        System.out.println(Character.isDigit(str.charAt(5)));


    }
}
