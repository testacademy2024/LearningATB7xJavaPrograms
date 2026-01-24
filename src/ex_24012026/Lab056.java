package ex_24012026;

public class Lab056 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless  (short bucketin to small bucket to bigger bucket then Implicit and Explicit works fine with no data loss)
        // Narrowing - Implicit, Explicit(with data type), loss( large bucket in small bucket then Implicit not possible and Explicit is possible with data loss)
        //Widening
byte b=10;
int a=b; //VALID – Implicit Casting - JVM does this by default
int a1=(int)b;//VALID -Explicit Casting--we are specifying that value of b is converted in to Integer and stored in int a1
        System.out.println(a1);
//Narrowing
        int val = 300;
       //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1=(byte)val;//InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);


    }
}
