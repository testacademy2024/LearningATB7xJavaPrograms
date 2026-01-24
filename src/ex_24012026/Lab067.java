package ex_24012026;

public class Lab067 {
    public static void main(String[] args) {
        String name = "Sanket";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Sanket");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10)); //String Index Out Of Bound Exception

    }
}
