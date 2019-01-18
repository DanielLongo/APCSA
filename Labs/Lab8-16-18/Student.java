
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int studentId;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        studentId = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setStudentId(int newID)
    {
        studentId = newID;
    }
    
    public int getStudentId() {
        return studentId;
    }
}
