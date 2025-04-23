package ch12.sec08;
//Calendar클래스를 이용하여 현재 날짜, 시간기준으로 다음과 같이 출력하세요.
import java.util.*;
public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); //Calendar.getInstance()이용해 현재 날짜와 시간을 가져온다.

        //연도, 월, 일 정보 호출.
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; // Calendar.MONTH는 0부터 시작하므로 +1처리해 1월부터 시작하는 실제 달력에 맞춰준다.
        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"년 "+month+"월 "+day+"일");

        //요일정보 설정
        String[] weekDays = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
        String weeks = weekDays[now.get(Calendar.DAY_OF_WEEK) - 1]; //인덱스는 0부터 6까지 이고, Calendar.DAY_OF_WEEK는 월=1,화=2 ... 금=7이므로, 1을 빼서 인덱스와 맞춰준다.
        //오전/오후 판별
        String times = (now.get(Calendar.AM_PM) == Calendar.AM) ? "오전" : "오후";
        //Calendar.AM_PM 통해 현재시간이 오전인지 오후인지 반환하고 삼항연산자 이용하여 판별.
        System.out.println(weeks + " " + times);

        //24시간 형식으로 시/분/초 정보 호출
        int hour = now.get(Calendar.HOUR_OF_DAY); // 24시간 형식 (0~23시)
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");

    }
}

//제시된 출력(예시)
//2024년 6월 18일
//화요일오후
//0시 25분 0초