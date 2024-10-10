package Classwork_InClassExamples.M303_9;

public class Student {

    private int studentID;
    private String studentFirstName;
    private String studentLastName;
    private String studentEmail;
    private String studentPhone;

    public Student(){}

    public Student(int studentID, String studentFirstName, String studentLastName,
                   String studentEmail, String studentPhone) {
        this.studentID = studentID;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }


}
