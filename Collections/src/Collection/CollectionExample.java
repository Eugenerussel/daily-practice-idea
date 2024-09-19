package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionExample {
    public static void main(String[] args) {
        //List is the interface
        //Arraylist follow insertion order
        //duplicates allowed
        //Collection items = new ArrayList();
        //set don't allow duplicates
        Collection items=new HashSet();
        items.add(70);
        items.add("Eugene");
        items.add(70);
        items.add(true);
        for (var item : items) {
            System.out.println(item);
        }
    }


}
