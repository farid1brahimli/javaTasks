package task5;

public class Developer extends Employeee {
    public Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void getSalary() {
        System.out.println(name + "'s current month salary is: " + (salary + 455));
    }
}
