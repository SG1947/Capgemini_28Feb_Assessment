package DSA.Day6.Secure_Investment_Portfolio;

abstract class InvestmentTransaction implements Transaction{
	private final String transactionId;
	private final String investorName;
	private final double investedAmount;
	private final Type investmentType;
	public InvestmentTransaction (String transactionId,String investorName,double investedAmount,Type investmentType) throws InvalidInvestmentException {
		if (investedAmount <= 0) {
            throw new InvalidInvestmentException("Invested amount must be greater than 0");
        }
		this.transactionId = transactionId;
        this.investorName = investorName;
        this.investedAmount = investedAmount;
        this.investmentType = investmentType;
    } 
    public String getTransactionId() {
        return transactionId;
    }

    public String getInvestorName() {
        return investorName;
    }

    public double getInvestedAmount() {
        return investedAmount;
    }

    public Type getInvestmentType() {
        return investmentType;
    }
	 public abstract InvestmentTransaction taxCalculation(double percentage) throws InvalidInvestmentException;
	 public abstract InvestmentTransaction bonusCalculation(double percentage) throws InvalidInvestmentException;
	
}