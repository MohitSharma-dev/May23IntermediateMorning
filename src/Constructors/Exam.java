package Constructors;

public class Exam {
    int exam_id;
    ReattemptExam reattemptExam;

    Exam(int id ){
        exam_id = id;
        this.reattemptExam = new ReattemptExam();
    }

    Exam(Exam other){
        this.exam_id = other.exam_id;
        this.reattemptExam = other.reattemptExam;
    }
}
