package aplication;

import entities.Student;
import entities.Subjects;
import entities.Teacher;

import javax.security.auth.Subject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        int op;
        studentList.add(new Student("name", LocalDate.parse("19/12/2001", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 21, "engsoft"));
        studentList.add(new Student("teste", LocalDate.parse("19/12/2501", DateTimeFormatter.ofPattern("dd/MM/yyyy")), 21, "cyber"));

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome");
        System.out.println("What's you need?");

        do{
            System.out.println();
            System.out.println("Enroll a student [1]");
            System.out.println("Cancel a registration of student [2]");
            System.out.println("Register teacher [3]");
            System.out.println("Remove teacher [4]");
            System.out.println("List student [5]");
            System.out.println("List teachers [6]");
            System.out.println("Exit [0]");

            System.out.print("->: ");
            op = in.nextInt();

        switch (op){
            case 1:
                System.out.print("Enter the student name: ");
                in.nextLine();
                String name = in.nextLine();
                System.out.print("Enter the student birth date (dd/mm/yyyy): ");
                LocalDate date = LocalDate.parse(in.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                System.out.print("Enter the student age: ");
                int age = in.nextInt();
                System.out.print("Enter the student's course: ");
                String course = in.next();
                Student student = new Student(name, date, age, course);
                studentList.add(student);

                break;

            case 2:

                break;

            case 3:
                System.out.print("Enter the teacher name: ");
                in.nextLine();
                String teacherName = in.nextLine();
                System.out.print("Enter the teacher gender: (male/female)");
                String gender = in.next();
                System.out.print("Enter the teacher age: ");
                int teacherAge = in.nextInt();
                System.out.print("What subject this teacher work? ");
                String subject = in.next();
                Teacher teacher = new Teacher(teacherName, gender, teacherAge, subject);
                System.out.println();

                break;

            case 4:

                break;

            case 5:
                System.out.println("You want: ");
                System.out.println("All students [0]");
                System.out.println("Specific student [1]");
                int res = in.nextInt();

                if (res == 0){
                    for (Student std:
                            studentList) {
                        System.out.println(std);
                        System.out.println();
                    }
                } else if (res == 1) {
                    System.out.print("Enter a name of student: ");
                    in.nextLine();
                    String studentName = in.nextLine();
                    for (Student std:
                            studentList) {
                        if (Objects.equals(std.getName(), studentName)){
                            System.out.println(std);
                        }
                    }
                }
                else{
                    System.out.println("Sorry, i can't understand");
                }
                break;

            case 6:

                break;

        }
    }while (op != 0);






        in.close();

    }
}
