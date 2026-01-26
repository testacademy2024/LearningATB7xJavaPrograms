package ex_26012026;

public class Lab105 {
    public static void main(String[] args) {
        char ch = 'A';
        ch=Character.toLowerCase(ch);
        if ( ch == 'a' || ch == 'e' || ch =='o' || ch == 'i' || ch == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
