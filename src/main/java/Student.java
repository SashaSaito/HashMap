import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String id;
    private final String name;
    private List<Double> grades;

    public Student(String id, String name, List<Double> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grades: " + grades;
    }
}
