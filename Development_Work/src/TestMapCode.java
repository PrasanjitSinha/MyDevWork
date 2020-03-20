import java.util.*;

class Emp1 {
    String name;
    Emp1( String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class TestMapCode {
    public static void main(String[] args) {
        Map<Integer, Emp1> map = new HashMap<Integer, Emp1>();
        map.put(1,new Emp1("Ansh"));
        map.put(2,new Emp1("rakhee"));
        map.put(3,new Emp1("prasanjit"));

        List<Map.Entry<Integer, Emp1>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Emp1>>() {
            @Override
            public int compare(Map.Entry<Integer, Emp1> o1, Map.Entry<Integer, Emp1> o2) {
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }
        });

        System.out.println(list);
    }
}
