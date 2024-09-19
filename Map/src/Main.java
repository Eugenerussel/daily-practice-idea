import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"Two");
        map.put(3,"three");
        System.out.println(map.get(1));
        //keyset-get all keys in the map
        for(int key: map.keySet()){
            System.out.println(key+" - "+map.get(key));

        }


    }
}