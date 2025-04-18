package ch06.sec07.exam04;
//Car 클래스가 다음과 같이 정의되어있다. 다음을 만족하는 생성자를 추가하세요.
//주어진 조건
//A. 매개변수가 없는 생성자(디폴트 생성자)
//B. 매개변수로 model만 갖는 생성자
//C. 매개변수로 model과 color를 갖는 생성자
//D. 매개변수로 model, color, maxSpeed를 갖는 생성자.
public class Car {
    //필드선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자 선언
    Car() {}
    Car(String model) {
        this.model=model;
    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
