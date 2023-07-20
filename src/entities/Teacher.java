package entities;

import java.time.format.DateTimeFormatter;

public class Teacher {

    private String name;
    private String gender;
    private Integer age;
    private String subject;

    public Teacher() {
    }

    public Teacher(String name, String gender, Integer age, String subject) {
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student:" + " "
                +"name: " + name + " "
                + "gender: " + gender + " "
                + "age:" + age + " "
                + "course: " + subject + " ";
    }
}
