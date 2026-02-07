package ex_07022026;

public class Lab222 {
    public static void main(String[] args) {
        // throw
        // Custom Exception
Bank sbi=new Bank("INR",100);
Bank icici=new Bank("INR",500);
int sum=sbi.add(icici);
        System.out.println(sum);
        Bank jpmorgan=new Bank("USD",90);
        int sum1= sbi.add(jpmorgan);
        System.out.println(sum1);
        Bank idfc=new Bank("INR",1000);
        int sum2= icici.add(idfc);
        System.out.println(sum2);

    }
}
