package DSA.Day6.Secure_Investment_Portfolio;

class DebtInvestment extends InvestmentTransaction {

    public DebtInvestment(
            String transactionId,
            String investorName,
            double investedAmount
    ) throws InvalidInvestmentException {

        super(transactionId, investorName, investedAmount, Type.DEBT);
    }
    @Override
    public void authorize() {
        System.out.println("Authorized");
    }
    @Override
    public void authorize(String securityCode) {
        if (!securityCode.equals("DB456"))
            throw new InvestmentRejectedException("Enter valid security code");

        System.out.println("Authorized successfully");
    }

    @Override
    public InvestmentTransaction taxCalculation(double percentage) throws InvalidInvestmentException {

        if (percentage < 0 || percentage > 30)
            throw new InvalidInvestmentException("Enter valid percentage");

        double newAmount = getInvestedAmount() * percentage / 100;

        return new DebtInvestment(
                getTransactionId(),
                getInvestorName(),
                getInvestedAmount() - newAmount
        );
    }

    @Override
    public InvestmentTransaction bonusCalculation(double percentage) throws InvalidInvestmentException {

        if (percentage < 0 || percentage > 30)
            throw new InvalidInvestmentException("Enter valid percentage");

        double newAmount = getInvestedAmount() * percentage / 100;

        return new DebtInvestment(
                getTransactionId(),
                getInvestorName(),
                newAmount + getInvestedAmount()
        );
    }
}
