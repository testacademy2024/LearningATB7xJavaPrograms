package ex_26012026;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Take user input and check if number id even or odd.
        // Logic Building - Ready
        // 1. Figure out the inputs &  // 2. Data type
        //  Data type  - . int
        // How to take input in the Java? - Scanner - class -
        // nextInt() -> input


        // 3. Do we need conversion or direclty
        // 4. Rough logic - num%2==0 even,odd
        // 5. optimize
        // int - size - 32 bit -> range( 2,147,483,647)
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int user_input=sc.nextInt();
        System.out.println(user_input);
        if(user_input%2==0)
        {
            System.out.println("It is a Even Number");
        }
        else{
            System.out.println("It is a Odd Number");
        }
    }
}
