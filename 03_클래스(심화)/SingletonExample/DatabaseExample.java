package SingletonExample;
//다음과 같은 출력이 나오도록앞에서정의한Database 클래스를 운영하는 클래스를 정의하세요.
public class DatabaseExample {
    public static void main(String[] args) {
        Database db = Database.getInstance();  //싱글톤객체 호출하여, db정의
        db.connect(); //데이터베이스 연결하기
        System.out.println("데이터베이스: "+db.connect());  //데이터베이스 정보 출력
        db.close(); //데이터베이스 연결닫기
    }
}

//제시된 출력
// MySQL에 연결합니다.
// 데이터베이스: MySQL
// MySQL을 닫습니다.