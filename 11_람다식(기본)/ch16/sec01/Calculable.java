package ch16.sec01;
//다음인터페이스를 함수형 인터페이스로 명시하세요
@FunctionalInterface   //<--함수형 인터페이스라고 명시하는 어노테이션
public interface Calculable {
    //추상메소드
    void calculate(int x, int y); //함수형 인터페이스는 오직 한개의 추상메소드만 갖는다.
}
