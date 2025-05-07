package ch16.sec03;
//다음과 같이 인터페이스와 클래스를 정의하세요.
@FunctionalInterface
public interface Workable {
    void work(String name, String job); //문자열 name과 job을 매개변수로 갖는 추상메소드 work()정의
}
