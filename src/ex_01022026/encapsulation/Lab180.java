package ex_01022026.encapsulation;

public class Lab180 {
    public static void main(String[] args) {
        ICICIBank amit=new ICICIBank("Amit",45000);
        //Purpose of adding below code is to set the values for name and balance, and it cannot be done as name and balance are private in ICICI Bank
//ic.name="Deepak";
//ic.balance=56000;
        //Add Getter and Setter in ICICI Bank class
        //Balance and Name set should only be allowed for Bank Admin so we need to add a code in set balance and set name function for authentication
amit.setBalance(45000,false);
        System.out.println(amit.getName());
        System.out.println(amit.getBalance());

        ICICIBank admin=new ICICIBank("admin",50000);
        admin.setBalance(50000,true);
        admin.setName("Shankar",true);
        System.out.println(admin.getBalance());
        System.out.println(admin.getName());
    }
}
