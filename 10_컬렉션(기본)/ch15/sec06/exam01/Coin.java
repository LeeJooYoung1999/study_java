package ch15.sec06.exam01;
//롬복을 이용하여 다음클래스를 완성하시오
import lombok.AllArgsConstructor;
import lombok.Getter;

//○ 전체 매개변수 생성자
@AllArgsConstructor
//○ value에 대한 Getter
@Getter
public class Coin {
    private int value;
}
