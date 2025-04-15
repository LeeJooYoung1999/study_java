package ch03.sec04;

public class AccuracyExample2 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;
        int result = totalPieces -number;
        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("사과 1개에서 남은 양: " + result/10.0);
    }
}
//실행결과 :
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=50684" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch03.sec04.AccuracyExample1
//10조각에서 남은 조각: 3
//사과 1개에서 남은 양: 0.3
//
//종료 코드 0(으)로 완료된 프로세스
//실행결과, 남은양이 0.3으로 딱 떨어지는 것을 확인가능하다.
//AccuracyExample1의 연산과 달리 정수 연산으로 변경했기 때문이다.