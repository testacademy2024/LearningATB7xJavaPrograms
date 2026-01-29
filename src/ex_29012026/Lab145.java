package ex_29012026;

public class Lab145 {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
        //Initially this will display Index out of bound as there is no length given
        //Three vertical  dots->Edit->Program Arguments->Enter the String without quotes like Sanket Ajit Umrani or 123 456 789
        //Re Run the Code to get the output based on the index chosen
        if(args.length>0)
        {
            for(int i=0;i< args.length;i++)
            {
                System.out.println(args[i]);
            }
        }
            else{
            System.out.println("No Arguments Given");
            }
        }
    }

