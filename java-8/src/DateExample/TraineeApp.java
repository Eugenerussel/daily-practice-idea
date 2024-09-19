package DateExample;

import java.time.LocalDate;
import java.util.List;

public class TraineeApp {
    public static void main(String[] args) {
        Trainees t1 = new Trainees(1, "Russel", LocalDate.parse("2024-08-20"));
        Trainees t2 = new Trainees(2, "charan", LocalDate.parse("2024-08-10"));
        Trainees t3 = new Trainees(3, "Gautham", LocalDate.parse("2024-06-20"));
        List<Trainees> traineesList = List.of(t1, t2, t3);
// Senior-who joined early.
        System.out.println("Senior");
        var list=traineesList.stream().min((a,b)->a.getDateJoined().compareTo(b.getDateJoined())).get();
        System.out.println(list);
        // junior
        System.out.println("Junior");
        var list1=traineesList.stream().max((a,b)->a.getDateJoined().compareTo(b.getDateJoined())).get();
        System.out.println(list1);
    }
}
