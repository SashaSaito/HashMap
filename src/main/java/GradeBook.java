import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private final HashMap<String, Student> students;

    public GradeBook() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(String id) {
        students.remove(id);
    }

    public Student findStudentById(String id) {
        return students.get(id);
    }

    public void displayAllStudents() {
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
