package ex_04022026;

public class Lab198 {
    public static void main(String[] args) {
        String num = "10";
        //int a = (int)num; //String to int conversion not possible through type casting
        Integer a=Integer.valueOf(num);//String to int conversion using Integer wrapper functions
        System.out.println(a);
        int a2=Integer.parseInt(num);//String value "10" is converted in to lowercase value 10 and then that lowercase 10 is converted in tointeger
        // String -> int, Integer
        // Primitive to Wrapper or reverse then you will use the concept.
    }
}
