package ex_31012026;

public class BankAccount {
    String bankName;
    float balance;
    String bankCode; // Instance
//DC
    BankAccount() {
        bankName="SBI";
        balance=0.0f;
        bankCode="SBI012026";
    }
        //PC

        BankAccount(String bName,float bal,String bCode)
        {
            this.bankName=bName;
            this.balance=bal;
            this.bankCode=bCode;




    }

    void printDetails(){
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }
}
