package ex_02022026.exLoan;

public class Lab188 {
    public static void main(String[] args) {
Son s1=new Son();
s1.loan50k();
//Father f=new Father();//Object cannot be created from Abstract Class, so someone who is extending it has to execute the job
Father f=new Son();//dynamic dispatch
f.loan25k();
f.loan50k();
    }
}
