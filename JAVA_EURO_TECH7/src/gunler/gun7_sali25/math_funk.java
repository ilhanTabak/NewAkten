package gunler.gun7_sali25;

public class math_funk {
    public static void main(String[] args) {


        double x=3.14;
        double y=100;

        double z=Math.max(x,y);
        System.out.println(z);
        //iclerinden en buyuk karakteri yazdirir

        double m=Math.min(x,y);
        System.out.println(m);

        //iclerinden en kucuk karakteri yazdirir

        double n=Math.abs(y);
        System.out.println(n);

        //eksi sayiyi arti olarak yazar

        double l=Math.sqrt(y);
        System.out.println(l);
        //karakokunu almaya yarar

        double t=Math.round(x);
        System.out.println(t);

        //yuvarlamaya yarar

        double f=Math.ceil(x);
        System.out.println(f);
        //verilen ondakli sayiyi bir ust sayiya cikartir

        double c=Math.floor(x);
        System.out.println(c);

    }
}
