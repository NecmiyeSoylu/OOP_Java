package Creat_obje;

public class Account 
{
    private String name;  
    private Double balance=90.0;
    
    public Account(String name, Double balance)
    {
        this.name=name;
        if(balance>=0.0)
            this.balance=balance;
        else    
            System.out.println("balance value is wrong. It cannot be negative");
    }
    public void deposit(double depositAmount)
    {
        if(depositAmount>=0.0)
            balance+=depositAmount;
        else
            System.out.println("deposit amount is wrong. It cannot be negative");
    }
    public double getBalance()
    {
        return balance;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
