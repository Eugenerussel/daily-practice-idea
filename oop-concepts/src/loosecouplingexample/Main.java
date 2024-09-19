package loosecouplingexample;

public class Main {
    public static void main(String[] args) {
        Phone phone=new Phone();
        JioSim sim1=new JioSim();
        AirtelSim sim2=new AirtelSim();
        phone.setSim(sim1);
        phone.call();
        phone.browseInternet();
        phone.setSim(sim2);
        phone.call();
        phone.browseInternet();

    }
}
