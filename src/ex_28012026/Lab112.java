package ex_28012026;

public class Lab112 {
    public static void main(String[] args) {
        final boolean b1 = true;
        // b1=false;
        System.out.println(b1);
//        for (int i = 0; b1; i++) {
////            System.out.println("Hello");
////        }
//            for (int i=0;;){
//         System.out.println("Hello");
//        }
//        for (;;){
//            System.out.println("Hello");
//       }
//        for(float f=0.0f;f<10.67;f++){
//            System.out.println("Hi,Float -> "+ f);
//        }
        for(byte f=0;f<10.67;f++){ //Byte belongs to integer family and thus ignores 0.67
            System.out.println("Hi,Byte -> "+ f);
        }
        System.out.println("For loop Terminated");
    }
}
