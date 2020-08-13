package CreationalDesignPatterns.BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder().setStudentFirstName("Dhanam").setGender('M').build();
        System.out.println(student);
    }
}
