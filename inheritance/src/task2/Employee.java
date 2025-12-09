package task2;

public class Employee extends Person{
    int salary;

    public Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }
}
