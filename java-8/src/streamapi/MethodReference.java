package streamapi;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {
        var list= List.of(10,20,30,40,50);
        //METHOD REFERENCE
        list.forEach(System.out::println);//  this is called method reference
        //OR
        //list.forEach(i-> System.out.println(i+" "));//" " is additional..we can't implement
        // this in method reference.
        List<String> nameList=List.of("Harish","Karan","Lokesh","Mohit");
        var out=nameList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(out);

        // TO PRINT OBJECTS (CONSTRUCTOR)

        Trainee t1 = new Trainee(1, "Eugene", "Tamilnadu");
        Trainee t2 = new Trainee(2, "Charan", "Tamilnadu");
        Trainee t3 = new Trainee(3, "Gautham", "Banglore");

        var list1=List.of(t1,t2,t3);
//        var out1=list1.stream().map(t->new Trainee(t)).collect(Collectors.toList());
//        System.out.println(out1);
    }
}
