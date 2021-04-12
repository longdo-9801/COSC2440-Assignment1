package Assignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String sID;
    private String sName;
    private LocalDate birthdate;

    public Student(String sID, String sName, String birthdate) {
        this.sID = sID;
        this.sName = sName;
        this.birthdate = LocalDate.parse(birthdate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String getsID() {
        return sID;
    }

    public String getsName() {
        return sName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Student: " + sName +
                "(" + sID + ")" +
                ", birthdate:" + birthdate
                ;
    }

    public String toCSV() {
        return this.getsID() + "," +
                this.getsName() + "," +
                this.getBirthdate();
    }
}
