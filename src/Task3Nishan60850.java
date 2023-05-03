public class Task3Nishan60850 {
    public static void main(String[] args)
    {

        Account account1=new Account("Nishan Mukhopadhyay",10000,60850);
        try
        {
            account1.withdrawal(100);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        catch (Exception e)
        {

        }
        finally
        {

            System.out.println(account1.getBalance());
        }

    }
}
    class Account
    {
        private String owner;
        private int balance;
        private int accountNumber;
        public Account(String owner,int balance,int accountNumber)
    {
        this.owner=owner;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    public String getOwner(){return owner;}
    public int getBalance(){return balance;}
    public void setBalance(int Balance){balance=balance;}
    public int getAccountNumber(){return  accountNumber;}
    public void withdrawal(int amount)throws NotEnoughMoneyException
    {
        if (balance>=amount)
        {
            balance=balance-amount;
        }
        else
        {
            System.out.println("You dont have enough ammount in your bank account");
            throw new NotEnoughMoneyException("You dont have enough ammount in your bank account");
        }
    }

}
    class NotEnoughMoneyException extends Throwable {
    public NotEnoughMoneyException(String message){super(message);}
    }