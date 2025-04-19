package SingletonExample;
//다음클래스를 Singleton 객체로만드세요.

public class Database {
    private static Database instance; //싱글톤 객체로 선언하길 요구하므로, static사용하여 클래스차원에서 단 하나의 변수만 유지하도록 설정.
    private Database() {}; //생성자를 private으로 제한.
    //getInstance 메소드로 유일한 인스턴스르 반환.
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    private String connection = "MySQL";

    public String connect() {
        System.out.println(connection+"에 연결합니다");
        return connection;
    }
    public void close() {
        System.out.println(connection+"을 닫습니다.");
    }
}
