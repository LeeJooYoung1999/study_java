package ch15.sec02.exam01;
//다음 Board클래스에 롬복을 사용하여 기본 데이터 클래스로 작성하시오.

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //기본 데이터 클래스 어노테이션 @Data를 사용하여 작성.
@NoArgsConstructor  //기본생성자 자동생성 어노테이션
@AllArgsConstructor  //필드포함 생성자 자동생성 어노테이션
//----------주어진 Board클래스----------------//
public class Board {
    private String subject;
    private String content;
    private String writer;
}
//-----------------------------------------//