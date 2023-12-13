package org.lessons.java.valutazioni;


import java.math.BigDecimal;

public class Main {

public static int randomNumber(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void main(String[] args) {
        Corso corso = new Corso();
        int id = 0;

        for (int i = 10; i <= 20; i++) {
            id++;
            Studente student = new Studente(id, randomNumber(0, 100), new BigDecimal(randomNumber(0, 5)));
            corso.addStudent(student);
        }

        corso.getStudentsList();
        System.out.println("Percentuale studenti promossi: " + corso.promotedStudents() + "%");
    }
}
