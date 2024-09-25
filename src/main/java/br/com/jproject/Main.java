package br.com.jproject;

import java.util.Arrays;

import static br.com.jproject.BubbleSortExample.bubbleSort;

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
    }
}