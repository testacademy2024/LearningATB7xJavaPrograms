package ex_04022026;

public class Lab209 {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        String ip=args[0];
        System.out.println(ip);//ArrayIndexOutOfBoundsException
        int a=Integer.parseInt(ip);
        int b=10/a;
        System.out.println(a);//NumberFormatException
        System.out.println(b);//ArithmeticException
        System.out.println("End of the program");
        //JVM will be Initialized
        //Creates and Starts the main Thread. - Main Called
        //1)Collects the Command Line Arguments
        //2)Creates the String array with CLI
        //3. Lab209.main(0)
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        // If don't handle the exception JVM -
        // Exception a=new Exception() and terminate the program.  G

    }
}
