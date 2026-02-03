package ex_02022026.multipleinheritance;

public class Son implements Father,Mother{
    @Override
    public void money() {//Father and Mother interface has void money() but it is incomplete i.e without any {}
        System.out.println("This is only one function which is complete");
    }

    @Override
    public void home() {//Father interface has void home() but it is incomplete i.e without any {}

    }
}
