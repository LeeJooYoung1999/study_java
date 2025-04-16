package ch05.sec03;
//다음 코드를 보고 결과를 예측해보고, 그 결과를 확인하세요
public class ReferenceVariableCompareExample {
        public static void main(String[] args) {
            int[] arr1; //배열 변수 arr1 선언
            int[] arr2; //배열 변수 arr2 선언
            int[] arr3; //배열 변수 arr3 선언
            arr1 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
            arr2 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr2 변수에 대입
            arr3 = arr2; //배열 변수 arr2의 값을 배열 변수 arr3에 대입
            System.out.println(arr1 == arr2); // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
            //arr1과 arr2의 내부 메모리 구성은 같으나, 서로 다른 배열객체로 생성되었으므로, 주소가 다르다. 따라서 False일것.
            System.out.println(arr2 == arr3); // arr2와 arr3 변수가 같은 배열을 참조하는지 검사
            //arr3은 arr2변수의 주소가 대입되었기 때문에 두 변수는 동일한 주소를 가지며, 같은 배열을 참조한다.
        }
}

//결과확인
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=50535" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch05.sec03.ReferenceVariableCompareExample
//false
//true
//
//종료 코드 0(으)로 완료된 프로세스


