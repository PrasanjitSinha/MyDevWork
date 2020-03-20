package abstractFactoryDesignPattern;

public class BankFactory extends AbstractFactory {
    @Override
    Bank getBankName(String bank) {
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("sbi")){
            return new SBI();
        }
        if(bank.equalsIgnoreCase("icici")){
            return new ICICI();
        }
        if(bank.equalsIgnoreCase("hdfc")){
            return new HDFC();
        }
        return null;
    }

    @Override
    Loan getLoan(String loan) {
        return null;
    }
}
