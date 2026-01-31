package ex_31012026;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson p1 = new ATBPerson();
        System.out.println(p1.name);//default values of String printed
        System.out.println(p1.phone);//default values of phone printed
        ATBPerson p2 = new ATBPerson("Sanket");//Assigning a value at the time of Object Creation
        //p2.name="Sanket"; Assigning a value after the object is created
        System.out.println(p2.name);//default values of String printed
        ATBPerson p3=new ATBPerson(908909675);
        System.out.println(p3.phone);//default values of phone printed
        ATBPerson p4=new ATBPerson("Ajit",809744245);
        System.out.println(p4.name);//default values of phone printed
        System.out.println(p4.phone);//default values of phone printed
    }
}
