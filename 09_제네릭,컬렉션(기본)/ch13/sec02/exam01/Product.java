package ch13.sec02.exam01;
//다음 조건을 만족하는 Product클래스를 정의하세요.
// - 멤버변수 kind, model을 제너릭으로 운영
// - 각각의 멤버에 대해 Getter, Setter메서드를 직접 정의하라.(Lombok사용불가.)
public class Product <K,M>{
    //필드선언
    private K kind;
    private M model;

    //메소드선언
    //Getter
    public K getKind(){return this.kind;}
    public M getModel(){return this.model;}
    //Setter
    public void setKind(K kind){this.kind = kind;}
    public void setModel(M model){this.model = model;}
}
