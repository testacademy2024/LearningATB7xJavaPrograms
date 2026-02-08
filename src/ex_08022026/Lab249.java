package ex_08022026;

public class Lab249 {
    public static void main(String[] args) {
        temp("Sanket");
        temp(123);
        temp(true);
        sum(3,4);
        sum("Sanket",56);



    }

    //T will take the type of data type  entered and any datatype can be entered
    public static <T> void temp(T name) {
        System.out.println(name);

    }

    public static <T> T sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}

