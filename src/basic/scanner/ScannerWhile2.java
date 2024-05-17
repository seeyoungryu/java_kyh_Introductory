package basic.scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 숫자 모두 0이 입력되면 프로그램이 종료됨");

        while (true) {
            System.out.println("첫 번째 정수를 입력해라 : ");
            int num1 = scanner.nextInt();

            System.out.println("두 번째 정수를 입력해라 : ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램이 종료된다");
                break;
            }

            //break가 if 문 내에 위치하는 것은 그 if 문의 조건이 만족될 때만 루프를 빠져나오기 위함입니다.
            //만약 break가 if 조건과 무관하게 while 루프 내부에 직접 위치한다면, 루프는 특정 조건 없이 항상 첫 번째 반복 후에 종료될 것입니다.
        }

    }
}
