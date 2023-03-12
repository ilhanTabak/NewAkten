package gunler.gun56_sali10;

public class UlkelerTest {

    public static void main(String[] args) {

        System.out.println(Ulkeler.ulkelersayac);



        Ulkeler ulke1=new Ulkeler("turkiye","tr",90);
        Ulkeler ulke2=new Ulkeler("Almanya","de",49);
        Ulkeler ulke3=new Ulkeler("ABD","usa",1);


        System.out.println(ulke1);
        System.out.println(ulke2);
        System.out.println(ulke3);

        Ulkeler ulke4=new Ulkeler("ingiltere","GB",48);

        System.out.println("Ulkeler.ulkelersayac = " + Ulkeler.ulkelersayac);

        System.out.println("ulke1.ulkelersayac = " + ulke1.ulkelersayac);

        System.out.println("ulke1.name = " + ulke1.name);
        System.out.println("ulke2.name = " + ulke2.name);

        ulke4.ulkelersayac=345;

    }
}
