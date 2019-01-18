
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
 
        System.out.println("Original Values set be constructor");
        System.out.println("Studen Id: " + s1.getStudentId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student GPA: " + s1.getGPA());
        System.out.println("Student Status: " + s1.getStatus());
        
        s1.setStudentId(798213);
        s1.setStatus(true);
        s1.setGPA(2.0);
        s1.setName("Bob");
        
        System.out.println("New values");
        System.out.println("Studen Id: " + s1.getStudentId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student GPA: " + s1.getGPA());
        System.out.println("Student Status: " + s1.getStatus());
        
        
    }
}
