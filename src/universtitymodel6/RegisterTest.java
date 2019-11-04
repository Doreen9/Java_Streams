package universtitymodel6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    List<Double> studentGrades1 = Arrays.asList(22.50, 3.52);
    List<Double> studentGrades2 = Arrays.asList(12.50, 44.52);
    List<Double> studentGrades3 = Arrays.asList(10.50, 34.52);
    List<Double> studentGrades4 = Arrays.asList(20.50, 19.52);

    List<Student> students = Arrays.asList(new Student(studentGrades1, "Christiana Asare", Level.FIRST), new Student(studentGrades2, "Samuel Kwakye", Level.FOURTH), new Student(studentGrades3, "Yaa Nuamah", Level.FOURTH),
            new Student(studentGrades4, "Doreen Dodoo", Level.FIRST));

    Register register1 = new Register(students);
    Student student1 = new Student(studentGrades4, "Charity Baidoo", Level.FIRST);
    Student student2 = new Student(studentGrades4, "Doreen Dodoo", Level.FIRST);

    @Test
    void getRegister() {

        List<String> studentNames = Arrays.asList("Christiana Asare","Samuel Kwakye", "Yaa Nuamah", "Doreen Dodoo");

        List<String> streamNames = register1.getRegister();

        System.out.println(streamNames);

        assertEquals(studentNames, streamNames);
    }

    @Test
    void getRegisterByLevel() {

        List<String> studentNames = Arrays.asList("Christiana Asare", "Doreen Dodoo");

        List<String> streamNames = register1.getRegisterByLevel(Level.FIRST);

        System.out.println(streamNames);

    }


    @Test
    void averageGrade() {
       Double result = register1.averageGrade();
        System.out.println(result);
    }

    @Test
    void getStudentName() {
        try {
           String name = register1.studentName(student1);
           System.out.println(name);
        } catch (StudentNotFoundException exception) {
            System.out.println(exception);
        }

    }
}