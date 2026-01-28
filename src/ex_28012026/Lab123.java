package ex_28012026;

public class Lab123 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++)
        {
if (i%2==0)
{
    System.out.println("Even Numbers are->"+i);
    continue;
}
            System.out.println("Odd Numbers are->"+i);
        }
    }
}
