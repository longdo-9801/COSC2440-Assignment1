package Assignment1;

public class Course {
    private String cID;
    private String cName;
    private int credits;

    public Course(String cID, String cName, int credits) {
        this.cID = cID;
        this.cName = cName;
        this.credits = credits;
    }

    public String getcID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course: " +
                cID + '-' +
                cName +
                "(credits: " + credits + ")"
                ;
    }

    public String toCSV() {
        return this.getcID() + "," +
                this.getcName() + "," +
                this.getCredits();
    }
}
