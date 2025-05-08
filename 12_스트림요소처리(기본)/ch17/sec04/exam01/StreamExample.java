package ch17.sec04.exam01;
//스트림을 이용하여 list에 담긴 Product를 출력하세요(toString 이용).
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //List컬렉션 생성
        List<Product> list = new ArrayList<>();
        for (int i =0; i<=5; i++){
            Product product = new Product(i,"상품"+i,"멋진회사",(int)(10000*Math.random())); //Product객체 생성
            list.add(product); //리스트에 Product객체 추가
        }
        //객체스트림 얻기
        Stream<Product> stream = list.stream(); //앞서 생성한 list를 스트림형태로 변환
        stream.forEach(p->System.out.println(p));
    }
}
