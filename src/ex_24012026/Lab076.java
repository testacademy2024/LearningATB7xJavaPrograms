package ex_24012026;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Sanket";
        //String s1 = "S a n k e t";
        //            |0|1|2|3|4|5|
        char c = s1.charAt(5);
        System.out.println(c); //t
        s1=s1.concat(" Umrani");
//       String s2=s1.concat(" Umrani"); // Sanket Umrani
        System.out.println(s1);
    }
}
