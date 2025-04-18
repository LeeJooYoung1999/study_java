package ch06.sec08.exam01;

public class Calculator {
    //리턴값이 없는 메소드 powerOn() 선언
    void powerOn(){
        System.out.println("전원을 켭니다");}
    //리턴값이 없는 메소드 powerOn() 선언
    void powerOff(){
        System.out.println("전원을 끕니다");}

    //입력받는 두 정수(int)를 합하고, 결과값을 리턴하는 메소드 정의
    int plus(int a, int b){
        int result = a + b;
        return result;
    }
    //입력받는 두 정수(int)를 나누어 떨어진 값을, 실수형태로 리턴하는 메소드 정의
    double divide(int a, int b){
        double result = (double)a / (double)b;  //전달받은 정수값을 실수형태로 자동형변환 한 후, 나눗셈 연산
        return result;
    }


}
