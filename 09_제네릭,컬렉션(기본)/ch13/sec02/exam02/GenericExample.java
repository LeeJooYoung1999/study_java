package ch13.sec02.exam02;
//앞에서 정의한 인터페이스와 클래스를 이용하여 다음출력이 나오도록 수정하시오.
public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent(); //HomeAgency클래스에서 재정의된 rent()메소드를 이용하여 Home객체를 호출, home변수에 저장함.
        home.turnOnLight();  //호출해놓은 Home객체의 turnOnLight()메소드를 실행.

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();  //CarAgency클래스에서 재정의된 rent()메소드를 이용하여 Car객체를 호출, car변수에 저장함.
        car.run();  //호출해놓은 Car객체의 run()메소드를 실행.
    }
}

//제시된 출력
//전등을켭니다.
//자동차가달립니다.
