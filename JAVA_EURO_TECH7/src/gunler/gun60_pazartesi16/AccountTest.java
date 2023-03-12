package gunler.gun60_pazartesi16;

public class AccountTest {

    public static void main(String[] args) {



        Account account=new Account();

        account.setAcc_number(123456);
        account.setName("Hasan");
        account.setEmail("hasan@gmail.com");
        account.setEmount(2500000.0);
        account.setAdress("London");
        account.setPhoneNumber("65435241242");
        System.out.println(account.getAdress());

        System.out.println(account.toString());
        System.out.println(account);


    }

}
