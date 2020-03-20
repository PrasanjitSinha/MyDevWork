package ThreadPrograms;

public class Test {
    public static void main(String[] args) {
        Printer p  =new Printer();

        Thread t1  =new Thread(new TaskOddEven(p,10,false));
        Thread t2 = new Thread(new TaskOddEven(p,10, true));

        t1.start();
        t2.start();
    }
}
