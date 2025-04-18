package ch06.sec07.exam02;
//다음Korean 클래스에 생성자의 매개변수로 name,ssn필드를 초기화하는 생성자를 정의하세요
public class Korean {
    //멤버선언 = 필드선언 = 속성선언
    String nation ="대한민국";
    String name;
    String ssn;
    //생성자선언
    public Korean(String n, String s) {
        name = n;
        ssn = s;
    }
}
