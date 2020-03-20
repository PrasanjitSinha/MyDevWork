package abstractFactoryDesignPattern;

public class LoanFactory extends AbstractFactory {
    @Override
    Bank getBankName(String bank) {
        return null;
    }

    @Override
    Loan getLoan(String loan) {
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        }
        if(loan.equalsIgnoreCase("business")){
            return new BusinessLoan();
        }
        if(loan.equalsIgnoreCase("education")){
            return new EducationLoan();
        }
        return null;
    }
}
