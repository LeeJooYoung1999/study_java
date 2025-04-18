package ch06.sec07.exam03;
//아래와 같이 Korean 클래스를 정의했을때,생성자에서 name, ssn필드를 초기화하세요.
public class Korean {
    // 필드선언
    String nation = "대한민국";
    String name;
    String ssn;
    // 생성자선언
    public Korean(String name, String ssn) {
        this.name = name; //생성자에서 초기화
        this.ssn = ssn;   //생성자에서 초기화
    }
}
