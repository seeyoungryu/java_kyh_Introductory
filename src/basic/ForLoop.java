package basic;

public class ForLoop {
    public static void main(String[] args) {
        //for문 기본 흐름
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

/* for문 구조 흐름
1.초기식이 실행된다 : int i=1;
2.조건식을 검증한다 i <=10;
3.조건식이 참이면 코드를 실행한다 : sout(i)
4.코드가 종료되면 증감식을 실행한다ㅏ i++
(반복 - 거짓이 되면 for 문 종료)
 */