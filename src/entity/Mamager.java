package entity;

public class Mamager extends Employee implements IPayable{

    public Mamager(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void pay() {
        System.out.println("bank account payed!");
    }
}
