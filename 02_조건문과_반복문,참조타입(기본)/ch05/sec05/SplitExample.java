package ch05.sec05;
//boad의 문자열을 ','를 찾아 분리하여 결과를 아래와 같이 출력하고,
//for문을 이용하여 출력하세요.
public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        //문자열의 분리
        String[] words = board.split(",");
        //분리된 문자열 토막들 인덱스로 나누어 출력
        System.out.println("번호: " + words[0]);
        System.out.println("제목: " + words[1]);
        System.out.println("내용: " + words[2]);
        System.out.println("성명: " + words[3]);
        System.out.println();  //줄내림
        //for문을 이용하여 출력하기
        for (int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }
    }
}
//제시된 출력
//번호: 1
//제목: 자바 학습
//내용: 참조 타입 String을 학습합니다.
//성명: 홍길동
//
//1
//자바 학습
//참조 타입 String을 학습합니다.
//홍길동