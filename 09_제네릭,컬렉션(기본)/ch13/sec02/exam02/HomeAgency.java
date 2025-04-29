package ch13.sec02.exam02;
// Rentable 인터페이스를구현하는HomeAgency, CarAgency클래스를정의하세요. - HomeAgency
// HomeAgency의 rent()는 Home클래스 인스턴스를 리턴할것.
public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home();  // HomeAgency의 rent()는 Home클래스 인스턴스를 리턴할것.
    }
}
