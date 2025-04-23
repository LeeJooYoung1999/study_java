package ch11.sec02.exam01;
//다음 프로그램의 문제점을 설명하고, 그 결과를 확인하세요.
public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}

//문제점 설명:
//5열에서 사용된 .length()메소드의 경우 문자열의 길이를 반환하는 메소드이다.
//이때, 12열의 구문에서 data의 매개값으로 null값을 대입하는데,
//이 경우 5행에서 .NullPointerException이 발생하게 된다.

//결과확인:
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\lib\idea_rt.jar=51808:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\student\Downloads\3차 실습과제_18회차_이주영\out\production\3차 실습과제_18회차_이주영" ch11.sec02.exam01.ExceptionHandlingExample1
//[프로그램 시작]
//
//문자 수: 10
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
//	at ch11.sec02.exam01.ExceptionHandlingExample1.printLength(ExceptionHandlingExample1.java:5)
//	at ch11.sec02.exam01.ExceptionHandlingExample1.main(ExceptionHandlingExample1.java:11)
//
//종료 코드 1(으)로 완료된 프로세스