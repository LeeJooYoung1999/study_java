package ch07.sec08.exam02;
//출력결과가 다음과 같이 나오도록 DriverExample을 완성하세요.
public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();  //driver객체 선언
        //이 driver객체 내부의 메소드 drive()는 원래
        // Vehicle클래스로 생성된 객체인 vehicle을 매개값으로 가짐.
        //이때, Vehicle클래스의 자식클래스인 Bus, Taxi의 객체도 매개값으로 제공할수가 있다.

        Bus bus = new Bus(); // 매개값으로 제공하기위한 bus객체 호출
        driver.drive(bus);   // driver객체 내부의 메소드인 drive()의 매개값으로 bus객체를 장착

        Taxi taxi = new Taxi(); // 매개값으로 제공하기위한 taxi객체 호출
        driver.drive(taxi);     // driver객체 내부의 메소드인 drive()의 매개값으로 taxi객체를 장착

    }
}

//제시된 출력
//버스가달립니다.
//택시가달립니다.