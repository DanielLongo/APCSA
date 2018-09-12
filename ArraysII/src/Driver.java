public class Driver {
    public static void main(String args[]) {
        String[] names = {"Daniel Longo", "Bill Mobly", "Tim King", "John Smith", "Henry Smith"};
        int[] nums = {798213, 837213, 829431, 934123, 293438};
        Student currStudent;
        Student[] students = new Student[5];
        for (int i = 0; i <5; i++) {
            currStudent = students[i];
            currStudent.setFullName(names[i]);
            currStudent.setStudentID(nums[i]);
//            students[i] = new Student(nums[i], names[i]);

        }
        for (int i = 0; i <5; i++) {
            currStudent = students[i];
            System.out.println("Student stats "  + currStudent.getName() + currStudent.getStudentID());
        }

    }
}
