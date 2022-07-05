package HomeWork05;

import java.util.Objects;

public class Student {
    private int id;
    private String Surname;
    private String FirstName;
    private String Patronymic;
    private int YearOfBirth;
    private String Address;
    private String PhoneNumber;
    private String Faculty;
    private int Course;
    private String Group;



    public Student(int id, String surname, String firstName, String patronymic, int yearOfBirth, String address, String phoneNumber, String faculty, int course, String group) {
        this.id = id;
        Surname = surname;
        FirstName = firstName;
        Patronymic = patronymic;
        YearOfBirth = yearOfBirth;
        Address = address;
        PhoneNumber = phoneNumber;
        Faculty = faculty;
        Course = course;
        Group = group;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return Surname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getFaculty() {
        return Faculty;
    }

    public int getCourse() {
        return Course;
    }

    public String getGroup() {
        return Group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public void setCourse(int course) {
        Course = course;
    }

    public void setGroup(String group) {
        Group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && YearOfBirth == student.YearOfBirth && Course == student.Course && Objects.equals(Surname, student.Surname) && Objects.equals(FirstName, student.FirstName) && Objects.equals(Patronymic, student.Patronymic) && Objects.equals(Address, student.Address) && Objects.equals(PhoneNumber, student.PhoneNumber) && Objects.equals(Faculty, student.Faculty) && Objects.equals(Group, student.Group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Surname, FirstName, Patronymic, YearOfBirth, Address, PhoneNumber, Faculty, Course, Group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Surname='" + Surname + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Patronymic='" + Patronymic + '\'' +
                ", YearOfBirth=" + YearOfBirth +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", Course='" + Course + '\'' +
                ", Group='" + Group + '\'' +
                '}';
    }
}
