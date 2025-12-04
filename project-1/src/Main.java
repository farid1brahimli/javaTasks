import sevice.StudentServices;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                Welcome to Student Management System!
                1. Create Student
                2. Get All Students
                3. Get Student By Id
                4. Update Student By Id
                5. Delete Student By Id
                6. Bayiraa!
                """);

            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println(StudentServices.createStudent());
                case 2 -> StudentServices.getAllStudents();
                case 3 -> System.out.println(StudentServices.getStudentById());
                case 5 -> StudentServices.deleteStudentById();
                case 6 -> System.exit(200);
                default ->  System.out.println("Invalid choice");
            }
        }

    }
}