package gunler.gun80_cuma10;


       import java.util.ArrayList;
       import java.util.LinkedList;
       import java.util.List;

       public class LinkedListExample {

       public static void main(String[] args) {


        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(12);
        linkedList.add(34);

        linkedList.push(45); //Add the element to beginning of LinkedList
        linkedList.push(5); //Add the element to beginning of LinkedList
        System.out.println(linkedList);

        List<Integer> liste = new ArrayList<>();
        liste.add(123);

        liste = new LinkedList<>();
        liste.add(1);
    }
}


