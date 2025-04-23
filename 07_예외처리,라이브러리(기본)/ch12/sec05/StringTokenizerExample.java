package ch12.sec05;
//다음을 만족하도록 프로그램을 수정하세요.
//○ split 메소드를 이용하여 "홍길동&이수홍,박연수"에서 이름문자열만 추출하여 출력
//○ String Tokenizer를 이용하여 "홍길동/이수홍/박연수" 에서 이름문자열만 추출하여 출력


import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        //split()메소드를 이용
        String data1 = "홍길동&이수홍,박연수";
        String[] names1 = data1.split("[&,]");
        System.out.println("split()메소드로 이름만 추출:");
        for (String name : names1) {
            System.out.println(name);
        }
        System.out.println(); //줄바꿈
        //String Tokenizer를 이용
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer tokenizer = new StringTokenizer(data2,"/");

        System.out.println("StringTokenizer로 이름만 추출:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
