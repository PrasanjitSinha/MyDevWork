import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

public class LRUCache {
    static int csize;
    static HashSet<Integer> set;
    static Deque<Integer> dq;

    LRUCache(int n){
        csize = n;
        dq = new LinkedList<>();
        set = new HashSet<>();
    }

    public void refer(int x){
        if(!set.contains(x)){
            if(dq.size()==csize){
                int last = dq.removeLast();
                set.remove(last);
            }
        } else {
            int index=0,i=0;
            Iterator<Integer> itr = dq.iterator();
            while(itr.hasNext()){
                if(itr.next() == x){
                    index = i;
                    break;
                }
                i++;
            }
            dq.remove(x);
        }
        dq.push(x);
        set.add(x);
    }
    public void display(){
        Iterator<Integer> itr = dq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
        LRUCache ca = new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }


}
