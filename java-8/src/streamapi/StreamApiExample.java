package streamapi;

import java.util.List;

import static java.util.spi.ToolProvider.findFirst;

public class StreamApiExample {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,5,2,3,4,5,6);
        int firsteven= list.stream()
                       .filter(i ->{
                           System.out.println("Filtered: "+ i);
                    return i%2==0;
        })
        .map(i->i*i).findFirst().get();
        System.out.println(firsteven);
    }
}
