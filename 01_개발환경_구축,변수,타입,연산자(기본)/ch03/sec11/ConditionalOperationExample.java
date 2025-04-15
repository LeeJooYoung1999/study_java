package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}

//실행결과
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=50970" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch03.sec11.ConditionalOperationExample
//85점은 B등급입니다.
//
//종료 코드 0(으)로 완료된 프로세스