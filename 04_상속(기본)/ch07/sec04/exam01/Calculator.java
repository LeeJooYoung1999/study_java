package ch07.sec04.exam01;
//문제에서 주어진 Calculator 클래스(해당 클래스를 Computer가 상속함.)
public class Calculator {
    //메소드선언
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의areaCircle() 실행");
        return 3.14159 * r * r;
    }
}
