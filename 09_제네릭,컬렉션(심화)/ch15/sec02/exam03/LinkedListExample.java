package ch15.sec02.exam03;
//앞의조건을 만족하는 프로그램을 작성하되, LinkedList컬렉션을 사용하여 리스트를 작성하시오.
//(앞의조건:
//Board클래스를 저장하기위한 ArrayList인스턴스를 생성하라.
//Board클래스의 인스턴스 5개를 생성하여 ArrayList에 추가하라.
//ArrayList에 저장된 요소의 개수를 출력하라.
//3번째 데이터를 추출하여 출력하라.
//일반 for문을 이용하여 순회하면서 리스트의 각 요소를 출력하라.
//인덱스2에 해당하는 요소 제거.
//인덱스2에 해당하는 요소 제거. (한번더)
//향상된 for문을 이용하여 순회하면서 리스트의 각 요소를 출력하라.)

import ch15.sec02.exam01.Board;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        //1.LinkedList인스턴스 생성
        List<Board> linkedList = new LinkedList<>();

        //2.Board클래스의 인스턴스 5개를 생성하여 LinkedList에 추가.
        linkedList.add(new Board("제목1", "내용1", "글쓴이1"));
        linkedList.add(new Board("제목2", "내용2", "글쓴이2"));
        linkedList.add(new Board("제목3", "내용3", "글쓴이3"));
        linkedList.add(new Board("제목4", "내용4", "글쓴이4"));
        linkedList.add(new Board("제목5", "내용5", "글쓴이5"));

        //3.저장된 총 객체 수 출력하기.
        int size = linkedList.size();
        System.out.println("총 객체 수: "+size);
        System.out.println();//줄바꿈

        //4.3번째 데이터(=인덱스2에 해당하는요소)를 추출하여 출력하기.
        Board board = linkedList.get(2);
        System.out.println(board.getSubject()+ "\t"+board.getContent()+"\t"+board.getWriter());
        System.out.println();//줄바꿈

        //5.일반for문을 이용해 순회하면서 리스트의 모든요소를 출력하기.
        for (int i = 0; i < linkedList.size(); i++) {
            Board b = linkedList.get(i);
            System.out.println(b.getSubject()+ "\t"+b.getContent()+"\t"+b.getWriter());
        }
        System.out.println(); //줄바꿈

        //6.인덱스2에 해당하는 요소 제거(X2)
        linkedList.remove(2);
        linkedList.remove(2);

        //7.향상된 for문을 이용해 순회하면서 리스트의 모든요소를 출력하기.
        for(Board b : linkedList) {
            System.out.println(b.getSubject()+ "\t"+b.getContent()+"\t"+b.getWriter());
        }
    }//psvm
}//클래스
