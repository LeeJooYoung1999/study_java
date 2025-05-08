package ch17.sec03;
//다음과 같이 Student클래스를 작성하세요.
public class Student {
    //필드
    private String name;
    private int score;

    //메소드
    public Student(String name, int score) { //매개변수 2개갖는 생성자
        this.name = name;
        this.score = score;
    }
    //getter
    public String getName() {return name;}
    public int getScore() {return score;}
}
