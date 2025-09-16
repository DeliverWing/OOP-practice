package entity;

import java.io.Serializable;

public class Worker extends Employee implements IPayable {
    public Worker(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void pay() {
        System.out.println("credit card payed!");
    }
}
