import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    int price;

    Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ProductTestStream {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"HP",1000));
        list.add(new Product(2,"Dell",2000));
        list.add(new Product(3,"Wip",3000));
        list.add(new Product(4,"app",4000));
        list.add(new Product(5,"len",5000));

        List<Integer> list1 = list.stream().filter(p->p.price > 2000).map(p->p.price).collect(Collectors.toList());

        System.out.println(list1);

    }
}
