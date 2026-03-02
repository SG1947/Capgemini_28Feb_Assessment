package DSA.Day6.Secure_Investment_Portfolio;

class EquityInvestment extends InvestmentTransaction {

    public EquityInvestment(
            String transactionId,
            String investorName,
            double investedAmount
    ) throws InvalidInvestmentException {

        super(transactionId, investorName, investedAmount, Type.EQUITY);
    }

    @Override
    public void authorize() {
        System.out.println("Authorized");
    }

    @Override
    public void authorize(String securityCode) {
        if (!securityCode.equals("EQ123"))
            throw new InvestmentRejectedException("Enter valid security code");

        System.out.println("Authorized successfully");
    }

    @Override
    public InvestmentTransaction taxCalculation(double percentage) throws InvalidInvestmentException {
        if (percentage < 0 || percentage > 30)
            throw new InvalidInvestmentException("Enter valid percentage");

        double newAmount = getInvestedAmount() * percentage / 100;

        return new EquityInvestment(
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

        return new EquityInvestment(
                getTransactionId(),
                getInvestorName(),
                newAmount+ getInvestedAmount()
        );
    }
}