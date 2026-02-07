package ex_07022026;

public class Lab225 {
    public static void main(String[] args) {
        try {
            String s1=null;
            if(s1==null)
            {
                throw new NullPointerException("Add proper value");
            }
            s1.trim();
        } catch (NullPointerException e) {
            System.out.println("Entered input is incorrect.Please Try Again");
        }
    }
}
