import java.util.*;

public class PrintLargestNumber {

    static void printLargest(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy = x+y;
                String yx = y+x;
                return xy.compareTo(yx)>0?-1:1;
            }
        });
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("54");
        list.add("546");
        list.add("548");
        list.add("60");
        printLargest(list);
    }
}
