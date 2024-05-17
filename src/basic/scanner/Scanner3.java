package basic.scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력해: ");
        int num1 = scanner.nextInt();

        System.out.println("두번째 정수 입력해 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("첫번째 수가 더 큼");
        } else if (num1 < num2) {
            System.out.println("두번째 수가 더 큼");
        } else {
            System.out.println("두 수가 같음");
        }
    }
}

