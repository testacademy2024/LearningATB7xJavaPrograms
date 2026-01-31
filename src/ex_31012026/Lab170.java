package ex_31012026;

import java.util.Scanner;

public class Lab170 {
    public static void main(String[] args) {
//        //This is using Default Constructor
//        BankAccount ba=new BankAccount();
//        System.out.println(ba.bankName);
//        System.out.println(ba.balance);
//        System.out.println(ba.bankCode);
//       //This is using Parameterized Constructor
//        BankAccount baicici=new BankAccount("ICICI",10000,"ICICI012026");//
//        System.out.println(baicici.bankName);
//        System.out.println(baicici.balance);
//        System.out.println(baicici.bankCode);
//
//        ba.printDetails();
//        baicici.printDetails();

        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly Enter the name of your bank");
        String bname=sc.next();
        System.out.println("Kindly enter the exact balance in your bank");
        float bal=sc.nextFloat();
        System.out.println("Kindle enter the IFSC code of your bank");
        String bcode=sc.next();


       //This is using Parameterized Constructor
        BankAccount baicici=new BankAccount(bname,bal,bcode);//
        System.out.println(baicici.bankName);
        System.out.println(baicici.balance);
        System.out.println(baicici.bankCode);


        baicici.printDetails();

        sc.close();
    }


}
