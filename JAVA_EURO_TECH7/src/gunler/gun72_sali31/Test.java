package gunler.gun72_sali31;

public class Test {

    public static void main(String[] args) {


        Chef chef=new Chef("Mahmut","Iskender");
        Waiter[] waiters={new Waiter("hasan",true),new Waiter("ayse",false)};
        Table[]tables={new Table(1,2),new Table(3,6)};

        Resrtaurant resrtaurant=new Resrtaurant(chef,waiters,tables);


        resrtaurant.serve("Iskender",2,4);

    }
}
