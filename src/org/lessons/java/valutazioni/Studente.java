package org.lessons.java.valutazioni;

import java.math.BigDecimal;

public class Studente {

    // ATTRUBUTI

    private int studentId;
    private int absencePercentage;
    private BigDecimal averageGrades;

    // COSTRUTTORI

    public Studente(int studentId, int absencePercentage, BigDecimal averageGrades) {
        this.studentId = studentId;
        this.absencePercentage = absencePercentage;
        this.averageGrades = averageGrades;
    }

    // GETTER E SETTER

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAbsencePercentage() {
        return absencePercentage;
    }

    public void setAbsencePercentage(int absencePercentage) {
        this.absencePercentage = absencePercentage;
    }

    public BigDecimal getAverageGrades() {
        return averageGrades;
    }

    public void setAverageGrades(BigDecimal averageGrades) {
        this.averageGrades = averageGrades;
    }


    // METODI



    public boolean hasPassed() {
        if (absencePercentage > 50) {
            return false;
        } else if (absencePercentage > 25 && absencePercentage < 50 && averageGrades.compareTo(new BigDecimal("2")) > 0) {
            return true;
        } else if (absencePercentage < 25 && averageGrades.compareTo(new BigDecimal("2")) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ID Studente: " + getStudentId() + "\n" +
                "Assenze: " + getAbsencePercentage() + "%" + "\n" +
                "Media: " + getAverageGrades() + "\n" +
                (hasPassed() ? "Promosso" : "Bocciato");
    }
}
