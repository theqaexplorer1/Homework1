package homework2;

/*
Задача 4:
Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */
public class Homework2_4 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 98 ) {
            i = i + 7;
            System.out.println(i);
        }
    }
}