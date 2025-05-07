package ch16.sec04;
//앞에서 정의한 인터페이스와 클래스를 이용하여 아래 코드를 완성하세요.

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 두 개 이상인 경우 의 람다식: 실행문이 두개이므로 중괄호 생략불가 => return문이 람다식 내에 존재하기 때문.
        person.action((x,y)->{
            double result = x+y;  //연산하는 실행문1
            return result;        //결과값을 리턴하는 실행문2
        });
        //sum() 메소드를 호출 하는 경우의 람다식 : return문이 sum()메소드 정의부에 있으므로, 실행문이 하나임 -> 중괄호생략가능해짐.
        person.action((x,y)->sum(x,y));  //중괄호가 생략된 모습
    }//psvm

    //sum()메소드를 정의
    public static double sum(double x, double y) {
        return x + y;
    }//sum정의
}//class

//제시된 출력
//결과: 14.0
//결과: 14.0