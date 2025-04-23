package ch12.sec03.exam05;
//다음 조건을 만족하는 Member 클래스를 정의하세요.
// - Lombok을 이용하여 정의함
// - 기본생성자, 전체필드를초기화하는생성자,
// - Getter/Setter 메소드
// - equals(), hashCode(), toString() 메소드
// - 위의 메서드들이 제대로 생성되었는지 IntelliJ의 Structure 기능으로 확인하세요

import lombok.*; //Lombok기능을 사용하기 위해 임포트


//Lombok 어노테이션 적용.

//Getter, Setter 메소드
@Getter
@Setter

//기본생성자, 전체필드를초기화하는생성자
@NoArgsConstructor
@AllArgsConstructor

//equals(), hashCode() 메소드, toString() 메소드
@EqualsAndHashCode
@ToString
public class Member {
    private String id;
    private String name;
    private int age;
}
