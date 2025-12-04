package sevice;

import model.Student;
import repository.StudentRepository;

import java.util.Scanner;
import java.util.UUID;

public class StudentServices {
    public static String createStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Student Surname: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Student Group: ");
        sc.nextLine();
        String group = sc.nextLine();

        Student student =  new Student(UUID.randomUUID().toString(), firstName, lastName, age, group, "Active");
        for(int i = 0; i < StudentRepository.students.length; i++){
            if (StudentRepository.students[i] == null){
                StudentRepository.students[i] = student;
                return "Student Created Successfully with this id: " + student.getId();
            }
        }
        return "Student Repository is Full. Can not create student";
    }

    public static Student getStudentById(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        for(Student student : StudentRepository.students){
            if(student != null && student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }

    public static void getAllStudents(){
        for(int i = 0; i < StudentRepository.students.length; i++){
            if(StudentRepository.students[i] != null && StudentRepository.students[i].getStatus().equals("Active")){
                System.out.println(StudentRepository.students[i]);
            }
        }
    }

    public static void deleteStudentById(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        for(int i = 0; i < StudentRepository.students.length; i++){
            if(StudentRepository.students[i] != null && StudentRepository.students[i].getId().equals(id)){
                StudentRepository.students[i].setStatus("Deleted");
                return;
            }
        }
    }
}
