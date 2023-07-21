package aplication;

import entities.Student;
import entities.Teacher;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();


        int op, res;


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

            switch (op) {
                case 1 -> {
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
                }
                case 2 -> {
                    System.out.print("Enter the student name: ");
                    in.nextLine();
                    String nameRemove = in.nextLine();
                    studentList.removeIf(std -> Objects.equals(std.getName(), nameRemove));
                }
                case 3 -> {
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
                    teacherList.add(teacher);
                }
                case 4 -> {
                    System.out.print("Enter the techer name: ");
                    in.nextLine();
                    String teacherRemove = in.nextLine();
                    teacherList.removeIf(thc -> Objects.equals(thc.getName(), teacherRemove));
                }
                case 5 -> {
                    System.out.println("You want: ");
                    System.out.println("All students [0]");
                    System.out.println("Specific student [1]");
                    System.out.println("-> ");
                    res = in.nextInt();
                    if (res == 0) {
                        for (Student std :
                                studentList) {
                            System.out.println(std);
                            System.out.println();
                        }
                    } else if (res == 1) {
                        System.out.print("Enter a name of student: ");
                        in.nextLine();
                        String studentName = in.nextLine();
                        for (Student std :
                                studentList) {
                            if (Objects.equals(std.getName(), studentName)) {
                                System.out.println(std);
                            }
                            else{
                                System.out.println("Student not found");
                            }
                        }
                    } else {
                        System.out.println("Sorry, i can't understand");
                    }
                }
                case 6 -> {
                    System.out.println("You want: ");
                    System.out.println("All Teachers [0]");
                    System.out.println("For subject [1]");
                    res = in.nextInt();
                    if (res == 0) {
                        for (Teacher tch :
                                teacherList) {
                            System.out.println(tch);
                            System.out.println();
                        }
                    } else if (res == 1) {
                        System.out.print("Enter a name of subject: ");
                        in.nextLine();
                        String subjectName = in.nextLine();
                        for (Teacher tch :
                                teacherList) {
                            if (Objects.equals(tch.getSubject(), subjectName)) {
                                System.out.println(tch);
                            }
                            else{
                                System.out.println("Teacher not found");
                            }
                        }
                    } else {
                        System.out.println("Sorry, i can't understand");
                    }
                }
            }
    }while (op != 0);






        in.close();

    }
}
