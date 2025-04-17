package ch06.sec09;
//Car클래스의 조건
//model 필드는 생성자로 초기화
//speed 필드의 getter/setter 메소드 정의
//run() 메소드 호출 시 다음과 같이 출력
//      >> xxx(model값)가 달립니다.(시속: yyy(speed값)km/h)
public class Car {
    //필드선언
    String model;
    int speed;

    //생성자 선언
    Car (String model) {
        this.model = model;
    }
    void setSpeed (int speed) {
        this.speed = speed;
    }
    void run() {
        this.setSpeed(100);
        System.out.println(this.model+"가 달립니다. (시속: " + this.speed + "km/h)");
    }
}
