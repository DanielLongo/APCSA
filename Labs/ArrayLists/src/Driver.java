import java.util.Scanner;
public class Driver {
    public static Scanner scr;
    public static void main(String[] args) {
        int input = 1;
        scr = new Scanner (System.in);
        StudentList stuList = new StudentList ( );
        while (input > 0) {
            input = menu ();
            switch (input) {
                case 1:
                    System.out.println ("Print a student");
                    stuList.printStudent (-1);
                    break;
                case 2:
                    System.out.println ("Add a new student");
                    stuList.createStudent ();
                    break;
            }
//            Student s1 = new Student ("Daniel", "Dominic", "Longo", 798213, 0.0);
//            stuList.addStudent (s1);
//            stuList.printStudent (0);
//            stuList.createStudent ( );
//            System.out.println ("Finished");

        }
    }
    public static int menu() {
        System.out.println ("To quit: q");
        System.out.println ("To print a student: 1");
        System.out.println ("To add a student: 2");
        System.out.println ("To remove a student: 3");
        System.out.println ("To modify a student: 4");
        System.out.print ("Enter: ");
        String response = scr.nextLine ( );
        int numericResponse;
        try {
            numericResponse = Integer.parseInt (response);
        }
        catch (NumberFormatException e) {
            if (response.equals (new String ("q"))) return 0;
            System.out.println ("Invalid Response.");
            return menu();

        }
        if ((numericResponse > 0) && (numericResponse < 4)) return numericResponse;
        return menu();
    }
}
