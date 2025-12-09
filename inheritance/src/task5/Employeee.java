package task5;

public class Employeee {
    public String name;
    public int salary;

    public Employeee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void getSalary() {
 System.out.println(name + "'s first month salary is: " + salary);
    }
}
