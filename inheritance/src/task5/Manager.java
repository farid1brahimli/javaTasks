package task5;

public class Manager extends Employeee {
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void getSalary() {
        System.out.println(name + "'s current month salary is: " + (salary + 275));
    }
}
