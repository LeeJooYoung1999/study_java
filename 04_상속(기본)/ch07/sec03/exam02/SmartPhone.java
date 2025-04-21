package ch07.sec03.exam02;
//같은 패키지 내의 Phone 클래스를 상속한 SmartPhone클래스를 정의하세요.
// model, color는 SmartPhone클래스의 생성자 매개변수로 초기화함
public class SmartPhone extends Phone {  //부모클래스인 Phone을 상속
    //자식생성자 선언
    public SmartPhone(String model, String color){
        super(model, color);  //생성자 매개변수 model, color들을 초기화 by super()메소드
        System.out.println("SmartPhone(String model, String color)인 자식생성자 실행됨.");
    }
}
