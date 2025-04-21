package ch07.sec08.exam01;
// CarExample의실행결과가 다음과 같도록 수정하세요.
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();  //Car 객체 myCar생성

        //Tire 객체를 장착
        myCar.tire = new Tire();
        myCar.run();

        //HankookTire 객체를 장착
        myCar.tire = new HankookTire();
        myCar.run();

        //KumhoTire 객체를 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}

//제시된 출력값
//회전합니다.
//한국타이어가회전합니다.
//금호타이어가회전합니다.