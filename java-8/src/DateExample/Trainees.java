package DateExample;

import java.time.LocalDate;

public class Trainees {
    private int id;
    private String name;
    private LocalDate dateJoined;

    public Trainees(int id, String name, LocalDate dateJoined) {
        this.id = id;
        this.name = name;
        this.dateJoined = dateJoined;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    @Override
    public String toString() {
        return "Trainees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateJoined=" + dateJoined +
                '}';
    }
}
