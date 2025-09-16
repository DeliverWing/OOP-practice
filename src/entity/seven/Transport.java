package entity.seven;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport implements ItramsportVehicle{
    protected String id;
    protected List<Station> route = new ArrayList<>();

    public Transport(String id) {
        this.id = id;
    }
    public void addStation(Station s) {
        route.add(s);
    }

    public String getId() {
        return id;
    }

    public void Start(){
        System.out.println("start vehicle");
    }

    @Override
    public void drive() {
        System.out.println("driving");
    }

    @Override
    public void stop() {
        System.out.println("stoped");
    }

    @Override
    public String toString() {
        return "Transport" +
                "id=" + id ;
    }
}
