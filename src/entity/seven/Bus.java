package entity.seven;

public class Bus extends Transport {

    public Bus(String id) {
        super(id);
    }

    @Override
    public void Start() {
        System.out.println("start bus");
    }

    @Override
    public void Arrive(Station s) {
        System.out.println("Bus " + id + " arrived at " + s.getName());
        s.addTransport(this);
    }

    @Override
    public void Depart(Station s) {
        System.out.println("Bus " + id + " departed from " + s.getName());
        s.removeTransport(this);
    }

    @Override
    public String toString() {
        return "Bus " +
                "id = " + id;
    }
}
