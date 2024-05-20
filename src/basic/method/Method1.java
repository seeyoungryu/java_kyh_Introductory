package basic.method;

public class Method1 {
    public static void main(String[] args) {
        int sum = add(10, 22); //메서드 호출
    }

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산수행");
        int sum = a + b;
        return sum;
    }
}
