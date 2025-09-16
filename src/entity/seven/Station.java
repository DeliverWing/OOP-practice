package entity.seven;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String name;
    private List<Transport> transports = new ArrayList<>();

    public Station(String name) {
        this.name = name;
    }

    public void addTransport(Transport t) {
        transports.add(t);
    }

    public void removeTransport(Transport t) {
        transports.remove(t);
    }

    public String getName() {
        return name;
    }

    public void printTransports() {
        System.out.println("Transports at " + name + ":");
        for (Transport t : transports) {
            System.out.println(" - " + t.getId());
        }
    }
}
