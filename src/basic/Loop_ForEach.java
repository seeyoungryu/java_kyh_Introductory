package basic;

public class Loop_ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println("----------------");
        //for each 문
        for (int number : numbers) {       //numbers ----> collection (순회할 컬렉션) - 배열
            System.out.println(number);
        }

        
    }
}
