import entity.seven.Train;
import entity.seven.Transport;
import entity.Employee;
import entity.Person;
import entity.seven.Bus;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("hagi",25);
        Employee emp= new Employee("gila",21, 5400);

//        System.out.println(person.toString());
//        System.out.println(emp.toString());
        Transport t1= new Bus("4");
        Transport t2= new Bus("4");
        Transport t3= new Train("4");
        Transport t4= new Train("4");

        List<Transport> transports = new ArrayList<Transport>();
        transports.add(t1);
        transports.add(t2);
        transports.add(t3);
        transports.add(t4);

        transports.forEach(System.out::println);//2 סוגים של הדפסות
        System.out.println(transports.toString());

        for(Transport t: transports){//הפעלת פעולת START
            t.Start();
        }

        
    }
}