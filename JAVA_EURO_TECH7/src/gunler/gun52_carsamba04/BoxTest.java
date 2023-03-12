package gunler.gun52_carsamba04;

public class BoxTest {

    public static void main(String[] args) {

        Box kutu=new Box();
        System.out.println("kutu.width = " + kutu.width);
        System.out.println("kutu.length = " + kutu.length);

        Box kutu1=new Box(23,45);
        System.out.println("kutu1.width = " + kutu1.width);
        System.out.println("kutu1.length = " + kutu1.length);


        System.out.println("kutu.areaCalculate() = " + kutu.areaCalculate());
        System.out.println("kutu1.areaCalculate() = " + kutu1.areaCalculate());

        kutu1.showInfo();

        String bilgi=kutu1.strShowInfo();

        System.out.println(kutu1);
        System.out.println(kutu);

        System.out.println("kutu.hashCode() = " + kutu.hashCode());
        System.out.println("kutu1.hashCode() = " + kutu1.hashCode());
        System.out.println("kutu1.equals(kutu) = " + kutu1.equals(kutu));

        boolean esitmi=kutu1.esitMi(kutu);
        System.out.println(esitmi);

        Box kutu2=new Box(kutu1);
        kutu2.showInfo();


    }



}
