package abstractFactoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbsFactTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter bank name");
        String bank = br.readLine();
        System.out.println("entere type of loan");
        String loanType = br.readLine();
        AbstractFactory factory = FactoryCreator.getFactory("BANK");
        Bank b = factory.getBankName(bank);
        System.out.println("interste rate for bank" + b.getBankName());
        double rate = br.read(); 
        int years = br.read();
        double loanAmt = br.read();

        AbstractFactory loanFact = FactoryCreator.getFactory("loan");
        Loan l = loanFact.getLoan(loanType);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmt,years);
    }
}
