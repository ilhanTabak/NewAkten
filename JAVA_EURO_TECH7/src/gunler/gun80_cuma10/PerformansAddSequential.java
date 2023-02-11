package gunler.gun80_cuma10;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformansAddSequential {

    public static void main(String[] args) {
        long baslangicZamani = System.nanoTime();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <10_000_000; i++){
            arrayList.add(i);
        }
        long bitisZamani = System.nanoTime();
        System.out.println("Adding performance(ArrayList)   : " + (bitisZamani - baslangicZamani) + " nano seconds.");

        baslangicZamani = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <10_000_000; i++){
            linkedList.add(i);
        }
        bitisZamani = System.nanoTime();
        System.out.println("Adding performance(LinkedList)  : " + (bitisZamani - baslangicZamani) + " nano seconds.");

/*
        System.out.println("Reading data sequentially");
        baslangicZamani = System.nanoTime();
        for (int i = 0; i <100000; i++){
            arrayList.get(i);
        }
        bitisZamani = System.nanoTime();
        System.out.println("Reading performance(ArrayList) : " + (bitisZamani - baslangicZamani) + " nano seconds.");*/


       /* System.out.println("Reading data sequentially");
        baslangicZamani = System.nanoTime();
        for (int i = 0; i <100000; i++){
            linkedList.get(i);
        }
        bitisZamani = System.nanoTime();
        System.out.println("Reading performance(LinkedList) : " + (bitisZamani - baslangicZamani) + " nano seconds.");*/

        System.out.println("Adding data with index");
        baslangicZamani = System.nanoTime();
        arrayList.add(50000,100);
        arrayList.add(50000,100);
        arrayList.add(50000,100);
        arrayList.add(50000,100);
        bitisZamani = System.nanoTime();
        System.out.println("Adding performance(ArrayList)   : " + (bitisZamani - baslangicZamani) + " nano seconds.");

        System.out.println("Adding data with index");
        baslangicZamani = System.nanoTime();
        linkedList.add(50000,100);
        linkedList.add(50000,100);
        linkedList.add(50000,100);
        linkedList.add(50000,100);
        bitisZamani = System.nanoTime();
        System.out.println("Adding performance(LinkedList)  : " + (bitisZamani - baslangicZamani) + " nano seconds.");
    }
}






