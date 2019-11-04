package universtitymodel6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    List<Double> studentGrades1 = Arrays.asList(22.50, 3.52);
    Student student1 = new Student(studentGrades1, "Christiana Asare", Level.FIRST);

    @Test
    void getGrades() {
        List<Double> grades = student1.getGrades().collect(Collectors.toList());
        System.out.println(grades);
    }
}