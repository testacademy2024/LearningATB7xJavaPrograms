package ex_31012026.accessmodifiers.police;

public class Cop {
    protected int gun;
    private String IDCard;

    protected Cop(int gun) {
        this.gun = gun;
    }
    protected void can_i_shoot()
    {
        System.out.println("Yes You Can Shoot");
    }
}
