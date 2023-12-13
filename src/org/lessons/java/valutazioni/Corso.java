package org.lessons.java.valutazioni;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Corso {

    // ATTRIBUTI

    private ArrayList<Studente> students = new ArrayList<>();

    // COSTRUTTORI



    // GETTER E SETTER

    public ArrayList<Studente> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Studente> students) {
        this.students = students;
    }


    // METODI

    public void getStudentsList() {
        System.out.println("Lista studenti: ");
        for (Studente student : students) {
            System.out.println(student.toString() + "\n");
        }
    }

    public void addStudent(Studente student) {
        students.add(student);
    }

    public void removeStudent(Studente student) {
        students.remove(student);
    }

    public BigDecimal promotedStudents() {
        long promoted = 0;
        for (Studente student : students) {
            if (student.hasPassed()) {
                promoted++;
            }
        }
        return BigDecimal.valueOf(promoted * 100).divide(BigDecimal.valueOf(students.size()), 0, RoundingMode.HALF_UP);
    }
}
