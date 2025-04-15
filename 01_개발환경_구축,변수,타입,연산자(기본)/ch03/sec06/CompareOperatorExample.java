package ch03.sec06;

public class CompareOperatorExample {
    public static void main (String[] args){
        //두 정수타입(int) 크기 비교연산
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
        //두 정수타입(문자,char) 크기비교연산
        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); //65 < 66
        System.out.println("result4: " + result4);
        //정수,실수간 동등한지 연산
        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5: " + result5);
        //두 실수간 동등한지 연산
        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);
        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);
        //두 문자열(String,참조형)간 동등한지 비교
        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));  //문자열은 참조형이므로, 동등연산자 대신, equals() or !equals()사용함 주의
        boolean result9 = (! str1.equals(str2));
        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
    }
}

//실행결과
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=50759" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch03.sec06.CompareOperatorExample
//result1: true
//result2: false
//result3: true
//result4: true
//result5: true
//result6: false
//result7: true
//result8: false
//result9: true
//
//종료 코드 0(으)로 완료된 프로세스