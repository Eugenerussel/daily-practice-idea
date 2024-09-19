package wildcard;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
    public static void main(String[] args) {
        //this<? extends Number> is called upper bound,this can have any type of
        //double,int,float.
        List<? extends Number> list=new ArrayList<>();
        list.add(3);

    }
}