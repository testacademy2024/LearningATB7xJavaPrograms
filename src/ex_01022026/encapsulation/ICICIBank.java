package ex_01022026.encapsulation;

public class ICICIBank {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature and Getters and Setters will always be public
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long balance;

    public ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if (isAdmin) {
            this.name = name;
            System.out.println("You are allowed to set the name");
        } else {
            System.out.println("You are not allowed to set the name");
        }
    }

        public long getBalance () {
            return balance;
        }

        public void setBalance (long balance,boolean isAdmin)
        {
            if (isAdmin) {
                this.balance = balance;
                System.out.println("You are allowed to set balance");
            } else {
                System.out.println("You are not allowed to set balance");
            }
        }
    }



