import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;
import jdk.nashorn.internal.ir.Block;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        BlockingQueue<Integer> q = new LinkedBlockingDeque<>();
        Thread t1 = new Thread(new Producer(q));
        Thread t2 = new Thread(new Consumer(q));

        t1.start();
        t2.start();
    }
}

class Producer implements Runnable{
    private BlockingQueue<Integer> q;

    Producer(BlockingQueue<Integer> q){
        this.q = q;
    }
    public void run(){
        for(int i=0;i<=10;i++){
            try{
                System.out.println("Producer" +i);
                q.put(i);
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> q;
    Consumer(BlockingQueue<Integer> q){
        this.q =q;
    }
    public void run(){
        while(true){
            try{
                System.out.println("consumer" + q.take());
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }
}