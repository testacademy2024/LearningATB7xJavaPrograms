package ex_02022026.staticKeyword;

public class Lab194 {
    // Static
    // block
    // Data member
    // Function
    // Class
    public static void main(String[] args) {

        //While Creating Object if ClassName is written then static block is called
        //After object is created i.e new ClassName IIB block is called and Default Constructor will be called
        //Constructor cannot be static
        ATB a1 = new ATB("Sanket");
        System.out.println(a1.getName());
        ATB a2 = new ATB("Umrani");
        System.out.println(a2.getName());
        System.out.println(ATB.CourseName); //Classname.VariableName(loaded from Class Loader (static keyword)
        //System.out.println(ATB.name);//name has private access specified and hence caanot be called with /Classname.VariableName
        ATB.doAssignment();
    }
}

class ATB{
    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a webite or anything before starting the
        // web automation or api automation
        //
        System.out.println("Reading from CSV file");
    }
    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name;
    static String CourseName="ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }
    static void doAssignment(){
        System.out.println("Do Assignment");
    }
    //Nested Class like Class Within Class is rarely used
    static class A{

    }
}
