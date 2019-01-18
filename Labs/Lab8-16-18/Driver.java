
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main() {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Original Student 1 ID: " +s1.getStudentId());
        s1.setStudentId(798213);
        System.out.println("New Student 1 ID: " + s1.getStudentId());
        System.out.println("Student 2 Default ID: " + s2.getStudentId());
    }
}
