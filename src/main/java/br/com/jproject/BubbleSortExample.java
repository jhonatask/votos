package br.com.jproject;

public class BubbleSortExample {

    // Método para ordenar o vetor usando Bubble Sort
    public static void bubbleSort(int[] v) {
        int n = v.length;
        boolean swapped;
        //Primeiro laço para percorrer o vetor
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            //Segundo laço para comparar os elementos
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    swapped = true;
                }
            }
            // Se não houve troca, o vetor já está ordenado
            if (!swapped) {
                break;
            }
        }
    }
}
