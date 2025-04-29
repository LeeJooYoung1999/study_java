package ch13.sec02.exam02;
// Rentable 인터페이스를구현하는HomeAgency, CarAgency클래스를정의하세요. - CarAgency
// CarAgency의 rent()는 Car클래스 인스턴스를 리턴할것.
public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car(); // CarAgency의 rent()는 Car클래스 인스턴스를 리턴할것.
    }
}
