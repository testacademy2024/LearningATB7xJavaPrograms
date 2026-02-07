package ex_07022026;

import java.util.Scanner;

public class Lab223 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
String name=sc.next();
if(name.equalsIgnoreCase("Sanket"))
{//throw is used to create an exception
    //try catch is used to handle the exception
    //throws is used to handle the exception
    try {
        throw new Exception("Not Allowed");///Create a custom exception
    } catch (Exception e) {
        System.out.println("Exception");
    }
}
else
{
    System.out.println("Allowed");
}

    }
}
