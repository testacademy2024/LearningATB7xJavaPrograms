package ex_30012026;

public class Lab159 {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        bank1.name = "SBI";
        bank2.name = "ICICI";
        System.out.println(bank1.name);
        System.out.println(bank2.name);
        System.out.println(bank2.balance); //balance is defined as String: change it to float or int
        bank2.balance=100.456f;
        System.out.println(bank2.balance);
        System.out.println(bank1.balance);
    }
}
