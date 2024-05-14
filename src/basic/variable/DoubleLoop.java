package basic.variable;

public class DoubleLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("외부for문 시작" + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("->내부 for문 " + "- " + j);
            }

            System.out.println();
            System.out.println("외부 for문 종료 i:" + i);
            System.out.println();
        }
    }
}
