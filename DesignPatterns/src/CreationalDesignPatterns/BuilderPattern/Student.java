package CreationalDesignPatterns.BuilderPattern;

public class Student {
    private String studentFirstName, studentLastName;
    private int age;
    private char gender;
    /*
        Instead of creating multiple constructors with different paramaters,
        use builder pattern which will build the student object
     */
    //Constructor will be private
    private Student(StudentBuilder studentBuilder){
        this.studentFirstName = studentBuilder.studentFirstName;
        this.studentLastName = studentBuilder.studentLastName;
        this.age = studentBuilder.age;
        this.gender = studentBuilder.gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static class StudentBuilder{
        private String studentFirstName, studentLastName;
        private int age;
        private char gender;

        public StudentBuilder setStudentFirstName(String studentFirstName) {
            this.studentFirstName = studentFirstName;
            return this;
        }

        public StudentBuilder setStudentLastName(String studentLastName) {
            this.studentLastName = studentLastName;
            return this;

        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;

        }

        public StudentBuilder setGender(char gender) {
            this.gender = gender;
            return this;

        }
        public Student build(){
            return new Student(this);
        }
    }
}
