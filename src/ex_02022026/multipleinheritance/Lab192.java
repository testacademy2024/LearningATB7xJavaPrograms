package ex_02022026.multipleinheritance;

public class Lab192 {
    public static void main(String[] args) {
        Son s=new Son();
        s.home();//Son is calling your own method instead of Father
        s.money();//Son is calling your own method instead of Father and Mother
    }
}
