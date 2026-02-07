package ex_04022026;

public class Lab211 {
    public static void main(String[] args) {
        int c= 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println("/ by zero!!, You fool!!");
        }
        System.out.println(c);

    }
}
