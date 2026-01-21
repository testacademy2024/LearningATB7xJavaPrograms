package ex_21012026;

public class Lab049 {
    public static void main(String[] args) {
        // BIO
        int a = 12;
        boolean b = !(a > 10 || a < 5);//BODMAS rule applied here(brackets resolve first)
        System.out.println(b);
        // BODMAS stands for
        // Bracket, Of, Division,
        // Multiplication, Addition, and Subtraction.
    }
}
