package ch07.sec04.exam01;
// ComputerExample클래스를 정의하여, Calculator와 Computer클래스의
// areaCircle() 메서드의 계산값을 모두 출력하세요.
public class ComputerExample {
    public static void main(String[] args) {
        double r = 10;

        Calculator calc = new Calculator(); //Calculator 객체 생성
        Computer computer = new Computer(); //Computer 객체 생성

        System.out.println("계산기로 계산한 원의넓이: "+calc.areaCircle(r)); //Calculator의 areaCicle()메소드 연산값 출력
        System.out.println(); //줄내림
        System.out.println("컴퓨터로 계산한 원의넓이: "+computer.areaCircle(r)); //Computer의 areaCircle()메소드 연산값 출력
    }
}
