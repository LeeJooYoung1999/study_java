package ch12.sec05;
//다음 프로그램의 실행결과를 적어보고, 실제 결과와 비교해 보세요.
public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")      //가변문자열"DEF" 추가 -> "DEF"
                .insert(0, "ABC") //0번째 위치에 "ABC"삽입 -> "ABCDEF"
                .delete(3, 4)       //3번째 문자인 D를 삭제함. ->"ABCEF"
                .toString();        //가변문자열 "ABCEF"을 문자열로 변환.
        System.out.println(data);   //완성된 문자열을 출력.
    }
}

//예상 실행결과: (구문별로 각주로 표시함.)
// >> ABCEF