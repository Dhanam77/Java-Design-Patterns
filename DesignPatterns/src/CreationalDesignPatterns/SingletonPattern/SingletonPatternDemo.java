package CreationalDesignPatterns.SingletonPattern;

public class SingletonPatternDemo {
    /*
        Singleton Pattern is generally used when we only want one instance of
        a class. This is useful when making a DB connection
     */
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        Student s3 = Student.getInstance();

        //All are pointing to the same object
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
