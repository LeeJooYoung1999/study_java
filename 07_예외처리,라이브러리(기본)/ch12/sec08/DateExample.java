package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

//현재 날짜데이터를 "2024.06.15 15:22:20"와 같은 포맷으로 출력하세요.

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date(); // 현재 날짜
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // SimpleDateFormat을 이용해, 지정된 형식으로 날짜를 포맷

        String strNow = sdf.format(now); // 현재날짜를 사전설정한 포맷에 맞추기
        System.out.println(strNow);     // 결과 출력
    }
}
