package ch06.sec08.exam01;
//다음 결과가 나오도록 Calculator 클래스를 정의하세요
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator(); //Calculator 객체 생성

        myCalc.powerOn(); //리턴값이 없는 powerOn() 메소드 호출

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2: " + result2);

        myCalc.powerOff();
    }
}

//제시된 출력
//