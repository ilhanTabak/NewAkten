package gunler.gun12_sali1;

public class SayiBulma {

    public static void main(String[] args) {

        int[]sayilar=new int[]{1,2,3,4,5,6};

        int aranacak=5;

        boolean varMi=false;

        for(int sayi:sayilar){

            if(sayi==aranacak){

                varMi=true;
                break;
            }
        }

    if(varMi){

        System.out.println("sayi mevcuttur");

    }else{

        System.out.println("sayi mevcut degildir");
    }

    }
}
