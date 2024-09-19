package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ListExampleWithGenerics {
    public static void main(String[] args) {
        List<String> items=new ArrayList<>();
        items.add("Laptop");
        items.add("Eugene");
        items.add("Table");
        items.add("Enemy");
        for (var item : items) {
            System.out.println(item.toString().toUpperCase());
        }
    }
}
