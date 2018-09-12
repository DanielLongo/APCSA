public class Student {
    private int studentID;
    private String fullName;
//    public void Student(int setStudentID, String setFullName) {
//        studentID = setStudentID;
//        fullName = setFullName;
//    }
    public void Student() {
        studentID = 000000;
        fullName = "no name";
    }

    public String getName() {
        return fullName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int newStudentId) {
        studentID = newStudentId;
    }

    public void setFullName(String newName) {
        fullName = newName;
    }


}
