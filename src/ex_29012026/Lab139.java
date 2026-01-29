package ex_29012026;

public class Lab139 {
    public static void main(String[] args) {
        // Arrays -> new
        int[] marks=new int [3];
        //index: 0,1,2
        //length: 1,2,3
        System.out.println(marks[0]);//As no data is stored, so default value of zero will be stored
        System.out.println(marks[1]);//As no data is stored, so default value of zero will be stored
        System.out.println(marks[2]);//As no data is stored, so default value of zero will be stored
        marks[0]=90; //Value is assigned at 0th position
        marks[1]=91; //Value is assigned at 1st position
        marks[2]=92; //Value is assigned at 2nd position
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
       // System.out.println(marks[10]);
        boolean[] is_married = {true, false, true};
        //Print using for loop
        for(int i=0;i< marks.length;i++)
        {
            System.out.println(i+"->"+marks[i]);
        }
        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for(int i=0;i< weekDays.length;i++)
        {
            System.out.println(i+"->"+weekDays[i]);


        }

    }
}
