package basic.scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            // while(true) ---> 중간에 break 문 만나기 전까지는 무한 반복한다
            System.out.println("문자열을 입력하시오(exit 입력시 종료): ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다 ");
                break;
            } //입력한 문자가 exit 인 경우 (if-true) > if문 내부 코드 출력 후 break 로 while 문 빠져나간다

            System.out.println("입력한 문자열: " + str);
        }


    }
}
