package ex_07022026;

public class Bank {
    private String currency;
    private int amount;

    public Bank(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int add(Bank bankName)
    {
        if(!bankName.currency.equalsIgnoreCase("INR"))
        {
            //throw exception for INR+DOLLAR sum is not allowed without conversion
            try {
                throw  new Exception("Currency does not match ");//if you are adding custom exception then we need to use try catch to handle this
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        int sum=this.amount+bankName.amount;
        return sum;
    }

    }

