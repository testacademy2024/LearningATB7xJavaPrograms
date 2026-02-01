package ex_01022026.encapsulation;
//Fixed Encapsulation
public class Lab179 {
    //In one JAVA file there can only be one public class and unlimited number of classes
    public static void main(String[] args) {
        VMOLogin1 vml=new VMOLogin1("admin","Password@123");
        // If using vml reference variable w need to know password and username then getter and setter needs tobe created at the sub class level
        //and then call getter and setter methods in main functions using .getfunctions()
        System.out.println(vml.getUsername()); //Existing Username is get
        vml.setUsername("new admin"); //New username is set
        System.out.println(vml.getUsername());//new username is get
        System.out.println(vml.getPassword());//Existing password is get
        //Hypothetically Write a code to Authenticate
        //Sanket->Is Auth true
        vml.setPassword("new Password 123",true);//new password is set based on IsAuth true
        System.out.println(vml.getPassword());//new password is get based on previous pasword set based on IsAuth true


        //Sanket ->Is Auth->False
        vml.setPassword("new Password 123",false);//new password should not be set as IsAuth is False
        System.out.println(vml.getPassword());//new password should not be get as it is not set




    }
}
class VMOLogin1{
    //Data members
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

   public void setUsername(String username) { //User can delete set method if we dont want username to be set
        Username = username;

   }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password,boolean IsAuth) {
        if(IsAuth)
        {
            Password = password;
        }
        else{
            System.out.println("Not a Valid User");
        }


    }

    public VMOLogin1(String username, String password) {
        Username = username;
        Password = password;
    }
}
