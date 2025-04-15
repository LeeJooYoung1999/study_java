package ch03.sec10;

public class AssignmentOperatorExample {
    public static void main(String[] args){
        int result = 0;
        result += 10;
        System.out.println("result=" + result);
        result -= 5;
        System.out.println("result=" + result);
        result *= 3;
        System.out.println("result=" + result);
        result /= 5;
        System.out.println("result=" + result);
        result %= 3;
        System.out.println("result=" + result);
    }
}

//결과확인
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=50941" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch03.sec10.AssignmentOperatorExample
//result=10
//result=5
//result=15
//result=3
//result=0
//
//종료 코드 0(으)로 완료된 프로세스