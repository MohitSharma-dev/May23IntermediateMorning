package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println(st1);
        // id is private
//        st1.id = 1;
        st1.setId(1);
//        System.out.println(st1.id);
        System.out.println(st1.getId());
        st1.age = 25;
        st1.name = "Mohit";
        st1.psp = 30.0;
        st1.gradYear = 1998;

        st1.print();

    }
}
