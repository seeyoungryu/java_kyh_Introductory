package basic.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요: ");
        String str = scanner.nextLine(); //입력을 String 으로 가져온다
        System.out.println("입력한 문자열 : " + str);

        System.out.println("정수입력하시오 : ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        //scanner.nextLine() , scanner.nextInt() ...

        // \n : 개행문자?
    }
}
