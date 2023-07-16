package entities;

import entities.enums.Status;

import java.util.Date;
import java.util.List;

public class Student {

    private String name;
    private Date birth;

    private List<String> subjects;

    private Status status;

    public Student() {
    }

    public Student(String name, Date birth, List<String> subjects, Status status) {
        this.name = name;
        this.birth = birth;
        this.subjects = subjects;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
