package ch02.sec09;

public class StringContactExample {
    public static void main(String[] args) {
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1); //20
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2); //128
        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3); //1028
        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4); //1028
        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5); //1010
    }
}

//출력결과:
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=50619" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch02.sec09.StringContactExample
//result1: 20
//result2: 128
//result3: 1028
//result4: 1028
//result5: 1010
//
//종료 코드 0(으)로 완료된 프로세스
//