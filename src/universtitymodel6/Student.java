package universtitymodel6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Nameable, HasLevel{

    private List<Double> studentGrades;
    private String studentName;
    private Level level;

    public Student(List<Double> studentGrades, String studentName, Level level){
        this.studentGrades = studentGrades;
        this.studentName = studentName;
        this.level = level;
    }

    public List<Double> getStudentGrades() {
        return studentGrades;
    }

    public double getAverageGrade(){
        Double total = 0.0;
        Double average = 0.0;
        for(Double grades: studentGrades){
            total += grades;
        }
        average = total / studentGrades.size();
        return average;

    }

    public Stream<Double> getGrades(){

        return studentGrades.stream();

    }

    @Override
    public String getName(){
        return studentName;
    }

    @Override
    public Level getLevel() {
        return level;
    }

}
