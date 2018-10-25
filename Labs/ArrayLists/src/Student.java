public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private int stuNumber;
    private double gpa;

    public Student() {
        firstName = "";
        middleName = "";
        lastName = "";
        stuNumber = 000000;
        gpa = 0;
    }

    public Student(String setFirstName, String setMiddleName, String setLastName, int setStuNumber, double setGpa) {
        firstName = setFirstName;
        middleName = setMiddleName;
        lastName = setLastName;
        stuNumber = setStuNumber;
        gpa = setGpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
