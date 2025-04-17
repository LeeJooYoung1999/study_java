package ch05.sec09;
//oldIntArray를 newIntArray 배열(요소가 5개임)로 복사하세요(?) => oldStrArray인듯
// System.arraycopy를 이용해 복사함
//for문을 이용해 제시된 바와 같이 각 요소를 출력함.
public class ArrayCopyByForExample {
    public static void main(String[] args) {
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i]+", ");
        }
    }
}

//제시된 출력
//java, array, copy, null, null,