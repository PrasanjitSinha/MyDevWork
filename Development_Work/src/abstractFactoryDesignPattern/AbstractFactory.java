package abstractFactoryDesignPattern;

abstract class AbstractFactory {
    abstract Bank getBankName(String bank);
    abstract Loan getLoan(String loan);
}
