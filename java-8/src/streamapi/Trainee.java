package streamapi;

public class Trainee implements Comparable<Trainee>{
    private int id;
    private String name;
    private String location;

    public Trainee(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int compareTo(Trainee t){
        return name.compareTo(t.name);
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name=" + name +
                ", location=" + location +
                '}';
    }
}
