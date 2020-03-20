package abstractFactoryDesignPattern;

public class HDFC implements Bank {
    private final String Bname;

    HDFC(){
        Bname = "HDFC";
    }
    @Override
    public String getBankName() {
        return Bname;
    }
}
