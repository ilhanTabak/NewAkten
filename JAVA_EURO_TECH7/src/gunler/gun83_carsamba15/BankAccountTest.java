package gunler.gun83_carsamba15;



    public class BankAccountTest {

        public static void main(String[] args) {

            var account = new BankAccount("12334567", "John Doe", 255000);

            // System.out.println(account.accountNumber);

            System.out.println("Account Number : " + account.getAccountNumber());
            System.out.println("Account Holder Name : " + account.getAccountHolderName());
            System.out.println("Current Balance : " + account.getBalance());

            account.setBalance(5000000);
            System.out.println("Current Balance : " + account.getBalance());

            account.deposit(5000);

            account.withdraw(-100);

            account.withdraw(600000000);

            account.withdraw(200);

            System.out.println(account.toString());

        }
    }



