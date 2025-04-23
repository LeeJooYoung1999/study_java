package ch12.sec03.exam02;
//다음 조건을 만족하는 Student 클래스를 정의하세요.
// - 멤버 필드를 초기화하는 생성자
// - 멤버 필드에 대한 Getter/Setter 메소드
public class Student {
    //주어진 멤버필드
    private int no;
    private String name;

    //주어진 멤버필드를 초기화하는 생성자
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    //멤버필드에 대한 Getter/Setter 메소드
    //no에 대한 Get/Set
    public int getNo() { //
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    //name에 대한 Get/Set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
