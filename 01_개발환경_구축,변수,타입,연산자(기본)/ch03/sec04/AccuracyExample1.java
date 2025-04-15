package ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args){
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double result = apple -number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);
    }
}

//실행결과
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=50718" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch03.sec04.AccuracyExample1
//사과 1개에서 남은 양: 0.29999999999999993
//
//종료 코드 0(으)로 완료된 프로세스
//실행결과, 산술결과가 0.3으로 딱 떨어지지 않는것을 확인가능하다.
//이는 부동소수점 방식을 사용하는 실수 타입으로 연산했기 때문