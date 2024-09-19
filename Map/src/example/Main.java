package example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Trainee t1 = new Trainee(1, "Eugene", "Tamilnadu");
        Trainee t2 = new Trainee(2, "Charan", "Tamilnadu");
        Trainee t3 = new Trainee(3, "Gautham", "Banglore");
        MapOfTrainees map = new MapOfTrainees();
        map.addToMap(t1);
        map.addToMap(t2);
        map.addToMap(t3);

        System.out.println(map.findById(3));
        for(Trainee t:map.sortByName()) {
            System.out.println(t);
        }
        map.removeById(3);
        map.AllList();
    }
    }
