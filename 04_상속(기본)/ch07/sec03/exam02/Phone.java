package ch07.sec03.exam02;
//다음 주어진 Phone 클래스를 상속한 SmartPhone클래스를 정의하세요.
//--> model, color는 SmartPhone 클래스의 생성자 매개변수로 초기화 함.
public class Phone {
    //2개의 필드 선언
    public String model;
    public String color;

    //2개의 필드에 대한 생성자 선언
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자실행");
    }
}
