package ThreadPrograms;

public class TaskOddEven implements Runnable {

    private int max;
    private Printer print;
    private boolean isEvenNumber;

    public TaskOddEven( Printer print, int max, boolean isEvenNumber) {
        this.max = max;
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2:1;
        while(number<=max){
            if(isEvenNumber){
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
        }
    }
}
