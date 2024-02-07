package accessModifiers;

import IntroToOOP.Student;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.age = 25;
//        s.id = 5;
        // protected can't be accessed outside the package
        // outside : only within the child class
//        s.psp = 50;
    }
}
