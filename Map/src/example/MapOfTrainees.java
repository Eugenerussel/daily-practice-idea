package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfTrainees {
    Map<Integer,Trainee> mapList=new HashMap<>();
    List<Trainee>list=new ArrayList<>();
    public void addToMap(Trainee trainee){
        mapList.put(trainee.getId(),trainee);
        list.add(trainee);
    }
    public Trainee findById(int id){
        return mapList.get(id);
    }
    public List<Trainee> sortByName(){
        list.sort((a,b)->a.getName().compareTo(b.getName()));
        return list;

    }
    public void removeById(int id){
         mapList.remove(id);
    }
    public void AllList() {
        for (Trainee t :mapList.values()) {
            System.out.println(t);
        }
        //or for(int key:maplist.keySet(){
        //sout(mapList.get(key))->return the values of the map.
    }

}

