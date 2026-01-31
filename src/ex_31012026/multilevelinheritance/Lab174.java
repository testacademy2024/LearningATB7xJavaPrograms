package ex_31012026.multilevelinheritance;

public class Lab174 {
    public static void main(String[] args) {
        // Multi Level
        // GF -> F -> Child
        Child c1 = new Child();  //Child Object Created
        //Child's properties is utilized
        c1.c();
        c1.home();
        //Father's properties inherited
        c1.home();//this will be always as child's as method name is same in father and Child
        c1.extra();
        c1.f();
        //Grandfathers properties inherited
        c1.f();
        c1.gf();
        c1.home();//this will be always as child's as method name is same in grandfather and Child
        Father f1=new Father(); //Father Object Created
        f1.home();//Father can access self properties
        f1.gf();//Father can access grandfather's properties
        Grandfather gf1=new Grandfather();//GrandFather Object Created
        gf1.home();//Grandfather can only access its self properties
        gf1.gf();//Grandfather can only access its self properties

    }
}
