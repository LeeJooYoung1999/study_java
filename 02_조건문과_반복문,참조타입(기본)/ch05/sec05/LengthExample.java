package ch05.sec05;
// ssn 변수의 주민등록번호가 유효한지 출력하세요(길이로 판단).
public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int effectiveness = ssn.length();
        if(effectiveness == 13){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호가 유효하지 않습니다.");
        }
    }
}

//제시된 출력
//주민등록번호 자릿수가 맞습니다.