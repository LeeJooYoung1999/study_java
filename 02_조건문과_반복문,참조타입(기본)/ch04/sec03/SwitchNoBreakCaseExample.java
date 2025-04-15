package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 9;   // 10, 11 인 경우
        System.out.println("[현재시간:"+time+"시]");

        switch (time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            case 11:
                System.out.println("외근을 나갑니다.");
        }
    }
}
//실행결과
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=51253" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch04.sec03.SwitchNoBreakCaseExample
//[현재시간:9시]
//회의를 합니다.
//업무를 봅니다.
//외근을 나갑니다.
//
//종료 코드 0(으)로 완료된 프로세스
//Switch 문인데, break문이 없어서 출력문이 전부 다 나오는것을 확인할 수 있다.