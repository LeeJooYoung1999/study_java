package ch18.sec10;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception {
        //FileOutputStream에 ObjectOutputStream 보조 스트림 연결
        FileOutputStream fos = new FileOutputStream("C:/temp/object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //객체 생성
        Member m1 = new Member("fall", "단풍이");
        Product p1 = new Product("노트북", 1500000);
        int[] arr1 = { 1, 2, 3 };

        //객체를직렬화해서파일에저장
        oos.writeObject(m1);
        oos.writeObject(p1);
        oos.writeObject(arr1);
        oos.flush(); oos.close(); fos.close();
    }
}
