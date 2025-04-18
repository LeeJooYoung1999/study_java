package ch06.sec07.exam05;
//Car 클래스가 다음과 같이 정의된 경우, 다른 생성자를 호출하여
// 필드를 초기화하도록 생성자를 수정하세요.

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //생성자선언 (수정할것.)
    Car(String model) {
        this(model,"은색",250);
    }
    Car(String model, String color) {
        this(model, color,250);
}
    Car(String model, String color, int maxSpeed)
    {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    //기본생성자 추가
    public Car() {
        this("기본모델", "기본색상", 0); // 다른 생성자 호출
    }


}

