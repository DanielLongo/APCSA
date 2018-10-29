public class Driver {
    public static void main(String[] args) {
        Student s1 = new Student("Daniel", "Dominic", "Longo", 798213, 0.0);
        StudentList stuList = new StudentList();
        stuList.addStudent (s1);
        stuList.printStudent (0);

    }
}
