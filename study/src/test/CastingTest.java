package test;

public class CastingTest {
    public static void main(String[] args) {
        byte age = 127;
        int age2 = age; //4바이트 <-자동으로 형변환 (자동형변환) -- 1바이트

        byte age3 = (byte)age2; //1바이트 <-- 강제형변환 - 4바이트

        //기본형끼리의 타입변환은 큰지 작은지만 판단하면 가능하다!!

        //<input name ="age" value="100"> ---> String으로 인식!
        String data = "100"; //입력데이터는 String으로 인식함
        int num = data; //기본형 <--- 기본형x : 하나(num)는 기본형이고, 하나(data)는 기본형이 아님.
        // 이럴땐 부품을 이용해주어야함. (Integer.parseInt())
        System.out.printf("내년 나이는 "+ (num + 1)); //101

        String data2 = "11.11";
        double num2 = Double.parseDouble(data2);
        // 마찬가지로 부품을 이용,(Integer.parseInt())

        //그럼 다시 숫자를 문자열로 바꾸고 싶다면? (=로 안됨.)
        //문자열에 들어있는 것을 기본형 변수에 바로 넣을수는 없다
        //마찬가지로, 기본형변수에 있던것을 문자열변수로 바로 넣을수는 없다.
        //부품을 써야한다!
        String data3 = String.valueOf(num2);
    }
}
