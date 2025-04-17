package ch05.sec05;
//문자열에 있는 "자바"를 "JAVA"로 변경하세요.
public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바","JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}

//제시된 출력
//자바 문자열은 불변입니다. 자바 문자열은 String입니다.
// JAVA 문자열은 불변입니다. JAVA 문자열은 String입니다