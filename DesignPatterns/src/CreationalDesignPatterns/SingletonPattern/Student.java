package CreationalDesignPatterns.SingletonPattern;

public class Student {
    //Only one instance to be returned
    private static Student instance = null;

    //Declared the constructor private so it cannot be called from other classes
    private Student(){
    }

    public static Student getInstance(){
        if(instance == null){
            instance = new Student();
        }
        return instance;
    }
}
