package br.com.jproject;

public class Main {
    public static void main(String[] args) {
        Election election = new Election(1000, 800, 150, 50);
        System.out.println("Valid votes percentage: " + election.validVotesPercentage() + "%");
        System.out.println("Blank votes percentage: " + election.blankVotesPercentage() + "%");
        System.out.println("Null votes percentage: " + election.nullVotesPercentage() + "%");
    }
}