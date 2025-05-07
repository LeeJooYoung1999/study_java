package ch16.sec05.exam03;
//다음과 같이 인터페이스를 정의하세요.

@FunctionalInterface
public interface Creatable1 {
    public Member create(String id); //매개변수가 1개인 생성자
}
