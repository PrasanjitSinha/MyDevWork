package abstractFactoryDesignPattern;

public class ICICI implements Bank {
    private final String Bname;

    ICICI(){
        Bname = "ICICI";
    }
    @Override
    public String getBankName() {
        return Bname;
    }
}
