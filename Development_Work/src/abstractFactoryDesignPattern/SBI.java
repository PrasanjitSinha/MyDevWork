package abstractFactoryDesignPattern;

public class SBI implements Bank {
    private final String Bname;

    SBI(){
        Bname = "SBI";
    }
    @Override
    public String getBankName() {
        return Bname;
    }
}
