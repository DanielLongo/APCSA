import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    ArrayList<Student> students;
    Scanner scr;
    public StudentList() {
        scr = new Scanner (System.in);
        students = new ArrayList<Student>();
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public String[] parseName(String fullName) {
        String[] nameArray = new String[3];
        if (fullName.split(",").length == 3) {
            return fullName.split(",");
        }
        System.out.println ("Invalid Name entered. Please use FIRST, MIDDLE, LAST");
        return new String[]{"", "", ""};

    }
    public void createStudent() {
        System.out.print ("Enter Student Name: ");
        String name = scr.nextLine ( );
        String[] nameArray = new String[3];
        nameArray = parseName (name);
        if (nameArray[0].equals (new String (""))) {
            System.out.println ("Invalid Credentials. Please Restart");
            createStudent ( );
        }
        String firstName = nameArray[0];
        String middleName = nameArray[1];
        String lastName = nameArray[2];

        try {
            System.out.print ("Enter Student Number: ");
            int studentNumber = Integer.parseInt (scr.nextLine ( ).replaceAll ("\\s+", ""));
            System.out.print ("Enter Student GPA: ");
            double studentGPA = Double.parseDouble ((scr.nextLine ( )).replaceAll ("\\s+", ""));
            Student newStudent = new Student (firstName, middleName, lastName, studentNumber, studentGPA);
            addStudent (newStudent);
        }
        catch (NumberFormatException e) {
            System.out.println("Student Number and GPA must be numbers. Please Restart");
            createStudent ( );
        }
    }

    public int findStudentIndex(int studentId) {
        Student currStudent;
        for (int i = 0; i < students.size (); i++) {
            currStudent = students.get(i);
            if (currStudent.getStuNumber () == studentId) {
                return i;
            }
        }
        System.out.println ("Student Not Found");
        return -1;
    }

    public void findStudent() {
        System.out.print ("Enter student id: ");
        int id = Integer.parseInt (scr.next ());
        int index = findStudentIndex (id);
        if (index > -1) {
            printStudent (index);
        }
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

    public void removeStudent() {
        System.out.print ("Enter student id: ");
        int id = Integer.parseInt (scr.next ());
        int index = findStudentIndex (id);
        if (index > -1) {
            students.remove (id);
            System.out.println (students.get (id).getLastName ( ) + " was removed");
        }
        else {
            System.out.println("Student not found");
        }
    }
    public void printAllStudents() {
        System.out.println("Printing all studetns");
        for (int i = 0; i < students.size (); i++) {
            printStudent (i);
        }
     }
    public void printStudent(int index) {
        if (index == -1) {
            index = students.size () -1;
        }

        else if (index == -2) {
            System.out.print ("h");
        }
        Student student = students.get(index);
        System.out.println(
                "First: " + student.getFirstName ()  + "\n" +
                "Middle: " + student.getLastName () + "\n" +
                        "Last: " + student.getLastName() + "\n" +
                        "Student Id: " + student.getStuNumber () + "\n" +
                        "Student GPA: " + student.getGpa () + "\n"
        );
    }

    public void clearStudents() {
        students = new ArrayList<Student> ();
    }

    public void modifyStudent() {
        System.out.print ("Enter student id: ");
        int id = Integer.parseInt (scr.next ());
        int index = findStudentIndex (id);
        if (index > -1) {
            students.remove (id);
            createStudent ();
        }
        else {
            System.out.println("Student not found");
        }
    }
}
