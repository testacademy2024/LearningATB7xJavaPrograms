package ex_31012026.accessmodifiers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop c=new Cop(10);
        System.out.println(c.gun);
        c.can_i_shoot();
    }



}
