package ch05.sec05;
//변수 ssn을 검사하여, 성별을  구분하세요 **ssn = Social Security Number
public class CharAtExample {
    public static void main (String[] args){
        String ssn = "9506241230123";
        //주민등록번호(사회보장번소)의 특정 자릿수가 성별을 표시함을 이용한다.
        char gender = ssn.charAt(6);  //charAt(n)메소드를 이용해, n자릿수의 문자를 추출.
        if(gender == '1'){
            System.out.print("남");
        } else if(gender == '2'){
            System.out.print("여");
        }
        System.out.print("자입니다.");
    }
}


//제시된 출력
//남자입니다.