package ex_26012026;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
        //Program to Find the Largest Among Three Numbers:
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the desired Number 1");
        int num1=sc.nextInt();
        System.out.println("Enter the desired Number 2");
        int num2=sc.nextInt();
        System.out.println("Enter the desired Number 1");
        int num3=sc.nextInt();

        if (num1>num2&&num1>num3)
        {
            System.out.println("The greatest number is ->"+num1);
        } else if (num2>num1&&num1>num3) {
            System.out.println("The Greatest number is->"+num2);}
            else if (num3>num1&&num3>num2)
            {
                System.out.println("The Greatest number is =>"+num3);
            }
            else {
                System.out.println("The number is not valid");
            }

        }
    }

