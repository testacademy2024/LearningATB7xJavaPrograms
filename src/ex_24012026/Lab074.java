package ex_24012026;

public class Lab074 {
    public static void main(String[] args) {
        //SCP (IF VALUES ARE SAME and referenced by two separate reference variables then only references are changed like name is changed to name1 )
        String name="The Testing Academy";
        String name1="The Testing Academy";


        //        System.out.println(name == name1); // Check for the Ref
//        System.out.println(name.equals(name1)); // Check for the Content

        //HEAP AREA (IF VALUES ARE SAME and referenced by two separate variables then name2 and name3 will be displayed)
        String name2=new String("The Testing Academy");
        String name3=new String("The Testing Academy");

        System.out.println(name1 == name2); // Check for the Ref
        System.out.println(name1.equals(name2)); // Check for the Content

    }
}
