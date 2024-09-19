package streamapi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String>list=List.of("Harish","Karan","Lokesh","Mohit");
        //sort
        var sorted=list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sorted);

        //find name start with H and M.
        var character=list.stream().filter(t->t.charAt(0)=='H'||t.startsWith("M")).toList();
        System.out.println(character);

        //return a single comma seperated string contining all the names.
        //var str=list.stream().collect(Collectors.joining(",")); OR
        var str=list.stream().reduce((name,s)->name+","+s);
        System.out.println(str);
    }
}
