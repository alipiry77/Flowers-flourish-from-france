package ch1.p6;

public class school {
    public static void main(String[] args) {
        course course = new course();
        course.name = "math";
        student student = new student();
        student.course = course;
        student.name = "ali";
        student.score = 12.5;
        student student1 = new student();
        student1.name = "hasan";
        student1.course = course;
        student1.score = 9.3;
        teacher teacher = new teacher();
        teacher.course = course;
        teacher.name = "akbar";
        student.scorePass(student.score);
        student1.scorePass(student1.score);
    }
}
