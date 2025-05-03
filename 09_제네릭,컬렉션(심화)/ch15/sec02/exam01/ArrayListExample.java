package ch15.sec02.exam01;
//다음조건을 만족하는 프로그램을 작성하세요.
//Board클래스를 저장하기위한 ArrayList인스턴스를 생성하라.
//Board클래스의 인스턴스 5개를 생성하여 ArrayList에 추가하라.
//ArrayList에 저장된 요소의 개수를 출력하라.
//3번째 데이터를 추출하여 출력하라.
//일반 for문을 이용하여 순회하면서 리스트의 각 요소를 출력하라.
//인덱스2에 해당하는 요소 제거.
//인덱스2에 해당하는 요소 제거. (한번더)
//향상된 for문을 이용하여 순회하면서 리스트의 각 요소를 출력하라.

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //1.(Board클래스를 저장할)ArrayList인스턴스 생성//
        List<Board> arrayList = new ArrayList<>();  //제네릭 이용하여 작성

        //2.Board클래스의 인스턴스 객체 5개 생성하여 ArrayList에 추가하기//
        arrayList.add(new Board("제목1", "내용1", "글쓴이1"));
        arrayList.add(new Board("제목2", "내용2", "글쓴이2"));
        arrayList.add(new Board("제목3", "내용3", "글쓴이3"));
        arrayList.add(new Board("제목4", "내용4", "글쓴이4"));
        arrayList.add(new Board("제목5", "내용5", "글쓴이5"));

        //3.ArrayList에 저장된 요소의 개수를 출력
        int size = arrayList.size();
        System.out.println("총 객체 수: "+size);
        System.out.println(); //줄바꿈

        //4.3번째 데이터(3번째 인덱스의 객체)를 추출하여 출력
        Board board = arrayList.get(2); //3번째 인덱스(=0, 1, "2")
        System.out.println(board.getSubject()+"\t"+board.getContent()+"\t"+board.getWriter()); //객체가 저장한 데이터 출력
        System.out.println(); //줄바꿈

        //5.일반 for문을 이용하여 순회하며 리스트의 각 요소를 출력
        for (int i = 0; i < arrayList.size(); i++) {
            Board b = arrayList.get(i);
            System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
        }
        System.out.println(); //줄바꿈

        //6. 인덱스 2에 해당하는 요소를 제거 (X2)
        arrayList.remove(2);
        arrayList.remove(2);

        //7.향상된 for문을 이용하여 순회하며 리스트의 각 요소를 출력.
        for(Board b : arrayList) {
            System.out.println(b.getSubject()+"\t"+b.getContent()+"\t"+b.getWriter());
        }//향상된for
    }//psvm
}//클래스

//제시된 출력
//총객체수: 5
//
//제목3 내용3 글쓴이3
//
//제목1 내용1 글쓴이1
//제목2 내용2 글쓴이2
//제목3 내용3 글쓴이3
//제목4 내용4 글쓴이4
//제목5 내용5 글쓴이5
//
//제목1 내용1 글쓴이1
//제목2 내용2 글쓴이2
//제목5 내용5 글쓴이5