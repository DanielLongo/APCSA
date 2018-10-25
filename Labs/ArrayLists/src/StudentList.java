import java.util.ArrayList;
public class StudentList {
    ArrayList<Student> students;
    private StudentList() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void removeStudent(int index) {
        if (index == -1) {
            index = students.size();
        }
        students.remove(index);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void printStudent(int index) {
        Student student = students.get(index);
        System.out.println(
                "First" + student.getFirstName ()  + "/n" +
                "Middle" + student.getLastName () + "/n" +
                        "Last" + student.getLastName()


        );
    }
}
