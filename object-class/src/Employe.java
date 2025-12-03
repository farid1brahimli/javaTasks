public class Employe {
     String name;
     int salary;
    Address address;

    public Employe(String name, int salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public  void showEmployeeDetails() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
        System.out.println("address: " + address.city + " | " + address.street + " | " + address.zipcode);
    }
}
