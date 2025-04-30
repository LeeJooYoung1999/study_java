package ch15.sec06.exam02;
//다음 조건을 만족하는 프로그램을 작성하시오.
// ○ LinkedList를 큐로 이용
//○ Message 인스턴스를 다음 순(command, to)으로 추가
//▪ sendMail, 홍길동
//▪ sendSMS, 신용권
//▪ sendKakaotalk, 감자바
//○ 큐가 빌 때까지 큐에서 Message를 추출하며 command에 따라 다음과 같이 출력
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        //Queue 컬렉션 생성 (LinkedList를 큐로 이용)
        Queue<Message> queue = new LinkedList<>();
        //Message를 주어진대로 추가.
        queue.offer(new Message("sendMail","홍길동"));
        queue.offer(new Message("sendSMS","신용권"));
        queue.offer(new Message("sendKakaotalk","감자바"));

        //메시지를 하나씩 가져와 처리
        while (!queue.isEmpty()) { //큐가 빌때까지
            Message message = queue.poll(); //큐에서 Message를 추출하며
            switch (message.command) {      //command에 따라
                case "sendMail":
                    System.out.println(message.to+"님에게 메일을 보냅니다."); //주어진대로 출력
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다."); //주어진대로 출력
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다."); //주어진대로 출력
                    break;
            }
        }
    }
}

//주어진 출력
//홍길동님에게 메일을 보냅니다.
//신용권님에게 SMS를 보냅니다.
//감자바님에게 카카오톡를 보냅니다.