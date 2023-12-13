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

    public String passedOrFailed() {
        String outcome = "";
        if (getAbsencePercentage() > 50) {
            outcome = "Bocciato";
        } else if (getAbsencePercentage() >= 25 && getAbsencePercentage() <= 50 && getAverageGrades().compareTo(new BigDecimal(2)) > 0) {
            outcome = "Promosso";
        } else if (getAbsencePercentage() < 25 && getAverageGrades().compareTo(new BigDecimal(2)) >= 0) {
            outcome = "Promosso";
        }
        return outcome;
    }
}
