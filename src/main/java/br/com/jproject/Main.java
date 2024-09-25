package br.com.jproject;

import java.util.Arrays;
import java.util.Scanner;

import static br.com.jproject.BubbleSortExample.bubbleSort;
import static br.com.jproject.FactorialCalculator.factorial;
import static br.com.jproject.SumMultiples.sumOfMultiples;

public class Main {
    public static void main(String[] args) {

        //Execucao do metodos de percentual de votos
        Election election = new Election(1000, 800, 150, 50);
        System.out.println("Valid votes percentage: " + election.validVotesPercentage() + "%");
        System.out.println("Blank votes percentage: " + election.blankVotesPercentage() + "%");
        System.out.println("Null votes percentage: " + election.nullVotesPercentage() + "%");


        //Execucao do metodo de ordenacao bubble sort
        int[] v = {5, 3, 2, 4, 7, 1, 0, 6};
        System.out.println("Vetor original: " + Arrays.toString(v));
        bubbleSort(v);
        System.out.println("Vetor ordenado: " + Arrays.toString(v));


        //Execucao do metodo de calculo de fatorial
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int number = scanner.nextInt();
        long factorialResult = factorial(number);
        System.out.println("O fatorial de " + number + " é: " + factorialResult);

        //Execucao do metodo de soma de multiplos
        System.out.print("Digite um número para calcular a soma dos múltiplos de 3 ou 5: ");
        int x = scanner.nextInt();
        int result = sumOfMultiples(x);
        System.out.println("A soma de todos os múltiplos de 3 ou 5 até " + x + " é: " + result);
    }
}