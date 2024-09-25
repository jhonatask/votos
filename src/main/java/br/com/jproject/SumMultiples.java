package br.com.jproject;

public class SumMultiples {

    public static int sumOfMultiples(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
