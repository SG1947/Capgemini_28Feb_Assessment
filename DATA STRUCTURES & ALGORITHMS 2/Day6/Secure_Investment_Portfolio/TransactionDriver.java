package DSA.Day6.Secure_Investment_Portfolio;
import java.util.*;
public class TransactionDriver {

    public static void main(String[] args) throws InvalidInvestmentException {
  
        InvestmentTransaction it = new DebtInvestment("1001", "ABC", 30000);
        it.authorize();
        List<Double>list=new ArrayList<>();
        InvestmentTransaction it1 =it.taxCalculation(10);
        InvestmentTransaction it2 =it.bonusCalculation(20);
        System.out.println("Current Investment Amount :"+it.getInvestedAmount());  
        list.add(it.getInvestedAmount());
        System.out.println("Updated Investment Amount after taxes :"+it1.getInvestedAmount());  
        list.add(it1.getInvestedAmount());
        System.out.println("Updated Investment Amount after bonus:"+it2.getInvestedAmount());
        list.add(it2.getInvestedAmount());
        list.sort(new CustomComparator());
        System.out.println(list);
    }
}

