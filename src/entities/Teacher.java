package entities;

import entities.enums.Subjects;

public class Teacher {

    private String name;
    private String gender;
    private Integer age;
    private Subjects subject;

    public Teacher() {
    }

    public Teacher(String name, String gender, Integer age, Subjects subject) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
}
