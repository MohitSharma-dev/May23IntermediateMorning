package IntroToOOP;

public class Student {
    private int id;
    String name;
    protected double psp;
    public int age;
    int gradYear;

    void print(){
        System.out.println("Student : " + name + " with psp : " + psp + " and age : " + age + " and id is" + id);
    }

    void attendClass(){
        System.out.println("Attending the class!");
    }

    void setId(int x){
        if(x < 0){
            throw new RuntimeException("Id is invalid");
        }
        id = x;
    }

    int getId(){
        return id;
    }
}
