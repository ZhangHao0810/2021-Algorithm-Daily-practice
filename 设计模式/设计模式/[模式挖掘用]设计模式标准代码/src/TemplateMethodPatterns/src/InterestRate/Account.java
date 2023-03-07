package TemplateMethodPatterns.src.InterestRate;

abstract public class Account
{
    protected String accountNumber;

    public Account()
    {
		accountNumber = null;
    }

    public Account(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    final public double calculateInterest()
    {
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType, accountNumber);

	   	return amount * interestRate;
    }

    abstract protected String doCalculateAccountType() ;

    abstract protected double doCalculateInterestRate() ;

    final public double calculateAmount(String accountType, String accountNumber)
    {
        return 7243.00D;
    }
}
