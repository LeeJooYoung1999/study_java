package ch09.sec02.exam01;
//앞에서 정의한 클래스를 이용해서 클래스 A와 내부클래스 B를 인스턴스화 시켜 보세요.
public class AExample {
    public static void main(String[] args) {
        //A객체 생성
        A a = new A();
        //B객체 생성
        A.B b = a.new B();
    }
}
