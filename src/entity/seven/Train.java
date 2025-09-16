package entity.seven;

public class Train extends Transport {

    public Train(String id) {
        super(id);
    }

    @Override
    public void Start() {
        System.out.println("start train");
    }

    @Override
    public void Arrive(Station s) {
        System.out.println("Train " + id + " arrived at " + s.getName());
        s.addTransport(this);
    }

    @Override
    public void Depart(Station s) {
        System.out.println("Train " + id + " departed from " + s.getName());
        s.removeTransport(this);
    }

    @Override
    public String toString() {
        return "Train " +
                "id = " + id ;
    }
}
