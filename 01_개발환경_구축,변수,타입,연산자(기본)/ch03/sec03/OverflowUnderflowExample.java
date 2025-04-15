package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var1++; //++ 연산은 var1의 값을 1 증가시킨다.
            System.out.println("var1: " + var1);
        }
        System.out.println("-----------------------");
        byte var2 = -125;
        for(int i=0; i<5; i++) { //{ }를 5번 반복 실행
            var2--; //-- 연산은 var2의 값을 1 감소시킨다.
            System.out.println("var2: " + var2);
        }
    }
}

//실행결과
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=50652" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch03.sec03.OverflowUnderflowExample
//var1: 126
//var1: 127
//var1: -128
//var1: -127
//var1: -126
//-----------------------
//var2: -126
//var2: -127
//var2: -128
//var2: 127
//var2: 126
//
//종료 코드 0(으)로 완료된 프로세스
//오버플로우란 타입이 허용하는 최대값을 벗어나는것, 언더플로우는 타입이 허용하는 최소값을 벗어나는것.
//따라서 위 결과중, byte타입인 var1이 최대값인 127에서 1을 더하면 128이 되며 오버플로우가 발생하여 연산결과는 최소값인 -128이 된다.
//               byte타입인 var2가 최소값인 -128에서 1을 빼면 -129가 되며 언더플로우가 발생하여 연산 결과는 최대값인 127이 된다.