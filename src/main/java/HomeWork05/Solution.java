package HomeWork05;

import java.util.Arrays;

import static HomeWork05.CreateStudents.getStudentArray;

public class Solution {
    public static void main(String[] args) {
        faculty(getStudentArray(), "Химия");
        studentFacultyAndCours(getStudentArray());
        year(getStudentArray(), 1997);
        listGroup(getStudentArray(), "Х20");
    }


    static void faculty(Student[] students, String faculty) {
        System.out.println("Студенты на факультете " + faculty + ":");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }

    static void studentFacultyAndCours(Student[] students) {
        System.out.println("Список студенитов по курсам");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + "курс:");
            for (Student student : students) {
                if (student.getCourse() == (i + 1))
                    System.out.println(student.toString());
            }
            System.out.println();
        }
        System.out.println();


        String[] faculty = new String[students.length];
        int k = 0;
        faculty[k] = students[0].getFaculty();
        k++;

        for (Student student : students) {
            boolean fl = true;
            for (String s : faculty) {
                if (student.getFaculty().equals(s)) {
                    fl = false;
                    break;
                }
            }

            if (fl) {
                faculty[k] = student.getFaculty();
                k++;
            }
        }

        if (k < students.length) {
            String[] mass = new String[k];
            for (int i = k; i < faculty.length; i++) {
                faculty[i] = "";
            }

            System.arraycopy(faculty, 0, mass, 0, k);
            faculty = mass;
        }

        Arrays.sort(faculty);


        for (String s : faculty) {
            System.out.println("Факультет " + s + ":");
            for (Student student : students) {
                if (student.getFaculty().equals(s)) {
                    System.out.println(student.toString());
                }
            }
            System.out.println();
        }
    }

    static void year(Student[] students, int year) {
        System.out.println("Список студентов, родившихся после " + year + ":");
        for (Student student : students) {
            if (student.getYearOfBirth() > year) {
                System.out.println(student.toString());
            }
        }
        System.out.println();
    }

    static void listGroup(Student[] students, String group) {
        System.out.println("Cписок учебной группы " + group + ":");
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student.toString());
            }
        }
    }
}
