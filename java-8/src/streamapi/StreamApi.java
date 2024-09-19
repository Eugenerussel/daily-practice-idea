package streamapi;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class StreamApi {
    // NORMAL METHOD
//    public static List<Integer> getEvens(List<Integer>list){
//        List<Integer>even=new ArrayList<>();
//        list.forEach(i->{
//            if(i%2==0){
//                even.add(i);
//            }
//
//        });
//        return even;
//    }
//    public static List<Integer>getSquares(List<Integer> list){
//        List<Integer>squares=new ArrayList<>();
//        list.forEach(i->squares.add(i*i));
//        return squares;
//    }
//    static int getSum(List<Integer>list){
//        int sum=0;
//        for(int nums:list){
//            sum=sum+nums;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        List<Integer> list=List.of(2,3,4,5,6);
//        List<Integer> evens=getEvens(list);
//        var squares=getSquares(evens);
//        var sums=getSum(squares);
//        System.out.println(sums);
//    }


    //USING STREAM API
    public static void main(String[] args) {
        //Stream<Integer> stream=Stream.of(10,20,30,40);
        //Stream is similar to list
        //but stream can be printed only once,it cannot be printed again and again.
        List<Integer>list=List.of(2,3,4,5,6);
        //one can add anynumber of filter and map.filter can be added even after map.
        //Lambadanotation- FUNCTIONAL INTERFACE
        // filter and map are intermediary method.
        // reduse- terminal method.won't get an another stream after this like filter and map.
        // reduse- reduces the stream to single output
        int sum=list.stream().filter(i->i%2==0).mapToInt(i->i*i).sum();
        System.out.println(sum);
    }
}

