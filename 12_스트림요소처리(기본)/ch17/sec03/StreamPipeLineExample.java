package ch17.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//스트림을 이용하여 다음과 같이 출력되도록 코드를 완성하세요.
//  - 스트림처리시 메서드 체이닝을 사용할것.
public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList( // Arrays.asList()는 고정된 크기의 리스트를 생성.
                new Student("홍길동",10),
                new Student("신용권",20),
                new Student("유미선",30)
        );

        double avg = list.stream() //list를 스트림형태로 변환
                //메서드 체이닝 사용.
                .mapToInt(student->student.getScore())
                .average()
                .getAsDouble(); //Optional값을 가져오므로, (실제 평균값얻도록)형변환 해준다.

        System.out.println("평균 점수: "+avg);
    }
}
