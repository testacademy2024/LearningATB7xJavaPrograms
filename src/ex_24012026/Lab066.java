package ex_24012026;

public class Lab066 {
    public static void main(String[] args) {
        int a = 87;
        long b = 91;
        String s1 = "KK";
        String s2 = "VV";
        System.out.println(s1+s2+a+b);//KKVV8791
        System.out.println(s1+s2+(a+b));//KKVV178
        System.out.println(a+s1+b+s2+(a+b));//87KK91VV178
    }
}
