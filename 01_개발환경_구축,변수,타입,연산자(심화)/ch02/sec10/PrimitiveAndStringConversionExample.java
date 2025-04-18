package ch02.sec10;
//다음과 같이 출력되도록 코드를완 성하세요
public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");  //주어진 문자열 값인 "10"을 정수형으로 변환
        double value2 = Double.parseDouble("3.14"); //주어진 문자열 값인 "3.14"를 실수형으로 변환
        boolean value3 = Boolean.parseBoolean("true"); //주어진 문자열 값인 "true"를 불리언 타입으로 변환

        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
        System.out.println("value3 : " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
    }
}

//제시된 출력
// value1: 10
// value2: 3.14
// value3: true
// str1: 10
// str2: 3.14
// str3: true