package ex_29012026;

public class Lab151 {
    public static void main(String[] args) {
        // String - Bunch of Chars.
        //
        String s1 = new String("sanket"); // Heap Area
        String s2 = "sanket"; // String constant pool

        // String - Immutable in nature.(once they are created if new action performed then it will create a new one
        System.out.println(s1.length());
        System.out.println(s1.indexOf("p"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
    }
}
