package universtitymodel6;

import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Student> students;

    public Register(List<Student> students) {

        this.students = students;
    }

    public List<Double> streamGrades() {

        return students.stream().flatMap(Student::getGrades).collect(Collectors.toList());

    }

    public List<String> getRegister() {
        return students.stream().map(Student::getName).collect(Collectors.toList());
    }

    public List<String> getRegisterByLevel(Level level) {
        return students.stream().filter(s -> s.getLevel() == level).map(Student::getName).collect(Collectors.toList());
    }

    public Double averageGrade() {

        Double avGrade = streamGrades().stream().reduce(0.0, Double::sum);
        return avGrade / streamGrades().size();
    }

    public String studentName(Student student) throws StudentNotFoundException {
        String name = student.getName();
        List<String> studentsList = students.stream().filter(s -> s.getName() == name).map(Student::getName).collect(Collectors.toList());
        if (studentsList.size() == 0) {
            throw new StudentNotFoundException("Student with name does not exist.");
        }
        else {
            return student.getName();
        }
    }
}

