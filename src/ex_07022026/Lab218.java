package ex_07022026;

public class Lab218 {
    //Exception Passing Concept
    //Child has the error->so it is passed to Parent-> and then it is passed  to SuperClass
    //We are handling this exception by surrounding to try/catch/finally at the line which is vulnerable as illustrated below
    public static void main(String[] args) {
        extracted();

    }
    private static void extracted()
    {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer [] i=new Integer[2];
            System.out.println(i[3]);//ArrayIndexOutOfBoundException-Unchecked Exception
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBound");
        } finally {
            // File.close, sc.close, sqlconnection.close.
            System.out.println("End of the program");
        }
    }
}
