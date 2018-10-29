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
}
