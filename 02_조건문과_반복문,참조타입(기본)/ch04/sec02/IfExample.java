package ch04.sec02;

public class IfExample {
    public static void main(String[] args){
        int score = 93;
        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        if(score < 90)
            System.out.println("점수가 90보다 작습니다.");
        System.out.println("등급은 B입니다."); //중괄호가 없기때문에 얘는 조건문과 상관없는 애로 처리되어, 출려되어버림.
    }
}

//실행결과:
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=51015" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch04.sec02.IfExample
//점수가 90보다 큽니다.
//등급은 A입니다.
//등급은 B입니다.  얘도 출력되어버림
//
//종료 코드 0(으)로 완료된 프로세스