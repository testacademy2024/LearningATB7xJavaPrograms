package ex_31012026;

public class ATBPerson {
    String name;
    long phone;

    ATBPerson() { //Constructor without parameters
        System.out.println("Object is created!");
    }
    ATBPerson(String nameGiven)
    //Constructor with parameters
    //nameGiven is coming fromObject Creation
    {
this.name=nameGiven;
    }
    ATBPerson(long telephone)
    {
        this.phone=telephone;
    }
    ATBPerson(String nameGiven,long telephone)
    {
        this.name=nameGiven;
        this.phone=telephone;
    }


    }

