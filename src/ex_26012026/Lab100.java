package ex_26012026;

public class Lab100 {
//New Feature and Rarely used
    public static void main(String[] args) {
        // JDK > 13
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65;
//            case 'B':
//                yield 66;//// return
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}
