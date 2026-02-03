package ex_02022026.ex_Interface.ex2;

public interface E {
    void startEngine();

    void stopEngine();
    //Complete functions are possible in Interface with default keyword
    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }
    //Complete methods are possible in Interface with default keyword
    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }
    //Complete methods are possible in Interface with static keyword
    static void M1() {
        System.out.println("M1");
    }
    void m2();
    void m3();
//  void m4(){//Interface abstracts methods cannot have body
//       System.out.println("Not possible");
//   }
}
