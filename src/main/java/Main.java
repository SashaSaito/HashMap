import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = getGradeBook();

        System.out.println("All students:");
        gradeBook.displayAllStudents();

        System.out.println("\nFinding student with ID 2:");
        Student foundStudent = gradeBook.findStudentById("2");
        if (foundStudent != null) {
            System.out.println(foundStudent);
        } else {
            System.out.println("Student not found.");
        }

        gradeBook.removeStudent("1");
        System.out.println("\nAfter removing student with ID 1:");
        gradeBook.displayAllStudents();
    }

    private static GradeBook getGradeBook() {
        GradeBook gradeBook = new GradeBook();

        List<Double> grades1 = new ArrayList<>();
        grades1.add(85.5);
        grades1.add(90.0);
        grades1.add(78.5);
        Student student1 = new Student("1", "John Doe", grades1);

        List<Double> grades2 = new ArrayList<>();
        grades2.add(88.0);
        grades2.add(92.5);
        grades2.add(80.0);
        Student student2 = new Student("2", "Jane Smith", grades2);

        List<Double> grades3 = new ArrayList<>();
        grades3.add(75.0);
        grades3.add(85.0);
        grades3.add(90.0);
        Student student3 = new Student("3", "Tom Brown", grades3);

        gradeBook.addStudent(student1);
        gradeBook.addStudent(student2);
        gradeBook.addStudent(student3);
        return gradeBook;
    }
}
