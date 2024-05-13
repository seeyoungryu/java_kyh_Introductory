package variable;

public class Var1 {

    /* 변수선언
    변수선언시 컴퓨터의 메로리 공간을 확보하고 (데이터 넣을 공간) 그 곳에 데이터를 저장할 수 있음
    변수 이름을 통해 해당 메모리 공간에 접근가능
     */
    public static void main(String[] args) {
        int a; //변수선언 (정수타입)
        a = 10; //변수 초기화 (최초 값 할당)
        System.out.println(a);
        a = 50; //변수 값 변경 (기존 값 삭제)
        System.out.println(a);
    }
}
