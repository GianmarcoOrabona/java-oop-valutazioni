package org.lessons.java.valutazioni;


import java.math.BigDecimal;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int numberOfStudents = random.nextInt(10, 21);
        int numberOfAbsence = random.nextInt(0, 101);
        BigDecimal average = new BigDecimal(random.nextInt(0, 6));

        Corso corso = new Corso();
        int id = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            Studente studente = new Studente(i, numberOfAbsence, average);
        }
    }
}
