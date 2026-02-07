package ex_04022026;

public class Lab216 {
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println("Divide By Zero");
        } finally {
            System.out.println("I will be always Executed, anyHow!!");
        }


    }
}
