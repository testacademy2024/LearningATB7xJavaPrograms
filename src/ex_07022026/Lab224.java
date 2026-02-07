package ex_07022026;

import java.util.Scanner;

public class Lab224 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of your choice");
        int x=sc.nextInt();
        try {
            if(x==0)
            {
                throw new ArithmeticException("Enter non zero number");
            }
            int a=10/x;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Not a Valid Number entered.Please Try Again");
        }

    }
}
