import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class StudentSorter {
    public static class Student {
        String name;
        Map<String, Integer> courseGrades;

        public Student(String name) {
            // Please provide your solution in the space below
        }

        public void addCourseGrade(String course, int grade) {
            // Please provide your solution in the space below
        }

        public double getGPA() {
           // Please provide your solution in the space below
        }

        public String getName() {
            // Please provide your solution in the space below
        }
    }

    public static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            // Please provide your solution in the space below
        }
    }

    public static List<Student> sortStudentsByGPA(List<Student> students) {
        // Please provide your solution in the space below
    }
}