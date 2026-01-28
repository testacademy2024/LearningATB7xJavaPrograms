package ex_28012026;

public class Lab122 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            if(i==5)
            {
                continue;
            }
            System.out.println("After!!");
        }
    }
}
