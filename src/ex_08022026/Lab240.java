package ex_08022026;

public class Lab240 {
    public static void main(String[] args) {
        Person p1=new Person("Sanket","KA");
        Person p2=new Person("Ajit","MH");
        System.out.println(p1);
        System.out.println(p2);

    }

}
class Person extends Object{
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name->"+name +" , "+"Address->"+address;
    }
}
