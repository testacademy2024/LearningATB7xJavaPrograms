package ex_26012026;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        // If Else - Condition  ( If, else If , else) - multiple condition
        // Switch - Better way to 2+ condition
        // Which day it is - Day to from 1 to 7
        // 3 -> Wed

        // MTWTFSS
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, Tell What day it its");
        byte day=sc.nextByte();
        switch (day){

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day its");
                break;
        }
        System.out.println("  ---- === Outside the Switch loop === -----");

    }
}
