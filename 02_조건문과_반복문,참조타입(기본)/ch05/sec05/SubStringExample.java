package ch05.sec05;
//ssn의 앞부분과 뒤부분을 추출하여 출력하세요.
public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0,6); //0~6번째 문자까지 한묶음으로 추출
        System.out.println(firstNum);
        String secondNum = ssn.substring(7); //7번째 문자부터 끝까지를 한묶음으로 추출
        System.out.println(secondNum);
    }
}


//제시된 출력
// 880815
// 1234567