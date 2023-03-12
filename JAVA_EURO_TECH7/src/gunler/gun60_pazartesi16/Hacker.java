package gunler.gun60_pazartesi16;

public class Hacker {

    public static void main(String[] args) {

        VictimBank hacker=new VictimBank(12345,0);


       // hacker.acc_balance=100000;

        hacker.depozitMoney(200000);

        hacker.depozitMoney(1000);

        System.out.println(hacker.printAccountBalance());

    }
}
