package ch05.sec05;
//문자열의 IndexOf()를 이용하여 "프로그래밍" 단어가 있는 위치를 출력하세요.
// 그리고, 자바와 관련된 책인지 판단하세요.
public class IndexOfContainsExample {
    public static void main(String[] args) {
        //"프로그래밍"이라는 단어가 있는 위치 출력하기
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        //자바와 관련된 책인지 알기 위해, 해당 책 내용에
        // '자바'라는 단어가 들어가는지(location이 양의 정수),검사하기
        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련없는 책이군요");
        }
    }
}

//제시된 출력
//3
//자바와 관련된 책이군요.