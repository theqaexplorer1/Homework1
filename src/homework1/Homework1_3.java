package homework1;

import java.util.Arrays;

public class Homework1_3 {
    public static void main(String[] args) {
        int n = 126;
        int n1 = n / 100;
        int n2 = (n / 10) % 10;
        int n3 = n % 10;

        System.out.println(n1+n2+n3);
    }
}
