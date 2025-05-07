package ch16.sec04;
//다음과 같이 Calculable 인터페이스와 Person 클래스를 정의하세요.
@FunctionalInterface
public interface Calculable {
    double calc(double x , double y); //double타입 매개변수가 2개이고, double타입 리턴값을 갖는 메소드 calc
}
