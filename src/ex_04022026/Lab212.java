package ex_04022026;

public class Lab212 {
    public static void main(String[] args) {
        //Bad Coder will use 3 try catch blocks
//        System.out.println("Start of the program");
//        String ip= null;
//        try {
//            ip = args[0];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(ip);//ArrayIndexOutOfBoundsException
//        int a= 0;
//        try {
//            a = Integer.parseInt(ip);
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        }
//        int b= 0;
//        try {
//            b = 10/a;
//        } catch (ArithmeticException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(a);//NumberFormatException
//        System.out.println(b);//ArithmeticException
//        System.out.println("End of the program");

        System.out.println("Start of the program");

        int b = 0; // ArithmeticException
        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            b = 1000/a;
        } catch (ArithmeticException| NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}
