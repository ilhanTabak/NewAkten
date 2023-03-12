package gunler.gun60_pazartesi16;

public class VictimBank {

    private int acc_number;
    private int acc_balance;


    public VictimBank(int acc_number, int acc_balance) {

        this.acc_number = acc_number;
        this.acc_balance = acc_balance;
    }


    public int printAccountNumber() {

        return this.acc_number;


    }

    public int printAccountBalance() {

        return this.acc_balance;
    }

    public void depozitMoney(int money) {

        if (money > 0) {

            this.acc_balance += money;


        }
    }


}



