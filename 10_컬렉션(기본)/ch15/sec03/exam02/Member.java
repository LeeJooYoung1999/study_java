package ch15.sec03.exam02;
//다음 Member클래스를 Set에 저장하기 위한 클래스로 수정하세요.
public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //해쉬코드 재정의 -> 이름가 name과 age가 같으면 같은 해쉬코드 리턴.
    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }

    //equals 재정의 -> name과 age가 같으면 true가 리턴.
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && target.age == age;
        } else {
            return false;
        }
    }
}
