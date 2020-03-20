package ThreadPrograms;

public class Printer {

    private volatile boolean isOdd;
    synchronized void printEven(int number){
        while (!isOdd){
            try{
                wait();
            } catch (Exception e){}
        }
        System.out.println(Thread.currentThread().getName() + " " + number);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number){
        while (isOdd){
            try {
                wait();
            } catch (Exception e){}
        }
        System.out.println(Thread.currentThread().getName() + " " + number);
        isOdd = true;
        notify();
    }
}
