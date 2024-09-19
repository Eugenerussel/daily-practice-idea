package streamapi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class SetExample {
    public static void main(String[] args) {
        Trainee t1=new Trainee(1,"Manya","Telangana");
        Trainee t2=new Trainee(2,"Russel","Tamilnadu");
        Trainee t3=new Trainee(3,"Gautham","Banglore");
        Trainee t4=new Trainee(1,"Charan","Tamilnadu");
        Trainee t5=new Trainee(1,"Maarcus","Tamilnadu");
// TO GET ONLY PEOPLE FROM TAMILNADU;
      /*  Set<Trainee> trainees=Set.of(t1,t2,t3,t4,t5);
        Set<Trainee> tamil=trainees.stream()
                .filter(t->t.getLocation().equalsIgnoreCase("Tamilnadu"))
                // for list give .toList();
                .collect(Collectors.toSet());
        for(Trainee t:tamil){
            System.out.println(t);
            }
            */
        List<Trainee> trainee=List.of(t1,t2,t3,t4,t5);
        List<Trainee> tamil=trainee.stream()
                .map(t-> new Trainee(t.getId(),t.getName(),"Tamilnadu"))
                .toList();
        //original list
        for(Trainee t:trainee){
            System.out.println(t);
        }

        //updated list
        for(Trainee t:tamil){
            System.out.println(t);
        }

        }
    }

