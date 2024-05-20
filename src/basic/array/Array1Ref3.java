package basic.array;

/*
배열 생성 - new int[5]; ---> int 형 변수 5개를 *연속으로* 만드는 것 ----> 배열의 크기만큼 메모리를 확보함
> 배열 생성 후-자바는 메모리 어딘가에 있는 이 배열에 접근할 수 있는 참조값(주소)를 반환함
>배열변수인 int[] students 에 생성된 배열의 참조값(주소값)을 보관함
 ( 이 참조값을 통해 배열을 참조할 수 있다 ~~ >> 참조값을 통해 메모리에 있는 실제 배열에 접근하고 사용할 수 있다

 */

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언 (변수는 한 번 선언함)
//        students = new int[5]; //배열 생성 - 배열 크기 : 5 ~~같은 타입의 변수 묶음
//
//
//        //변수 값 대입
//        students[0] = 90;  //배열 인덱스는 0 부터 시작함
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;
        students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화


        //변수 값 사용 (리팩토링)
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + " 점수" + students[i]);

        }

        System.out.println("------------------------");

        System.out.println(students.length);
        System.out.println("------------------------");
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수" + students[i]);

        }
        System.out.println("------------------------");
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
