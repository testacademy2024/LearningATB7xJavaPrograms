package ex_24012026;

public class Lab078 {
    public static void main(String[] args) {
        String password  = "Sanket@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        // pass_u == password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //Sanket@123 =  sanket@123  = SAnket@123 = SanKet@123
        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('k'));
        System.out.println(password.length());
    }
}
