package entities;

import entities.enums.Status;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Student {

    private String name;
    private LocalDate birth;
    private Integer age;

    private String subjects;

    private Status status;


    public Student() {
    }

    public Student(String name, LocalDate birth, Integer age, String subjects) {
        this.name = name;
        this.birth = birth;
        this.age = age;
        this.subjects = subjects;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "name: " + name + "\n"
                + "birth date: " + birth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n"
                + "age:" + age + "\n"
                + "course: " + subjects + "\n";
    }
}
