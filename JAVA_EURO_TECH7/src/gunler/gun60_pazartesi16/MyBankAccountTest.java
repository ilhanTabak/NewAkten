package gunler.gun60_pazartesi16;

public class MyBankAccountTest {

    public static void main(String[] args) {


        MyBankAccount user=new MyBankAccount(123456,0);

        System.out.println("user account number"+user.printAccountNumber()+"user account balance"+user.printAccountBalance());




        user.depozitMoney(15000);

        System.out.println(user.printAccountBalance());
    }

}
