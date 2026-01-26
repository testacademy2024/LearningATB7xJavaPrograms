package ex_26012026;

public class Lab098 {
    public static void main(String[] args) {
        // JDK > 13

        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!"); //Break keyword not required if arrow mark -> is used
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }
    }
}
