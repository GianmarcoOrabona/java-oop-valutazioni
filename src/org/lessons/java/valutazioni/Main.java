package org.lessons.java.valutazioni;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Studente studente = new Studente(1, 20, new BigDecimal(2));
        System.out.println(studente.passedOrFailed());
    }
}
