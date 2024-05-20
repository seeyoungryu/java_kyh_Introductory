package basic.array;

/*
배열 생성 - new int[5]; ---> int 형 변수 5개를 *연속으로* 만드는 것 ----> 배열의 크기만큼 메모리를 확보함
> 배열 생성 후-자바는 메모리 어딘가에 있는 이 배열에 접근할 수 있는 참조값(주소)를 반환함
>배열변수인 int[] students 에 생성된 배열의 참조값(주소값)을 보관함
 ( 이 참조값을 통해 배열을 참조할 수 있다 ~~ >> 참조값을 통해 메모리에 있는 실제 배열에 접근하고 사용할 수 있다

 */

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 40, 2, 90, 20, 40, 50, 60,};
        System.out.println("------------------------");

        System.out.println(students.length);
        System.out.println("------------------------");
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수" + students[i]);

        }

    }
}
