package ex_01022026.encapsulation;
//Encapsulation
public class Lab178 {
    //In one JAVA file there can only be one public class and unlimited number of classes
    public static void main(String[] args) {
        VMOLogin vml=new VMOLogin("admin","Password@123");
        System.out.println(vml.Password);
        vml.Password="new123";
        System.out.println(vml.Password);

    }
}
class VMOLogin{
    public String Username;
    public String Password;

    public VMOLogin(String username, String password) {
        Username = username;
        Password = password;
    }
}
