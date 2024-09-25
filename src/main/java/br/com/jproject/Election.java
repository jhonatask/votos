package br.com.jproject;

public class Election {

    private int totalVoters;
    private int validVotes;
    private int blankVotes;
    private int nullVotes;

    public Election(int totalVoters, int validVotes, int blankVotes, int nullVotes) {
        if (validVotes + blankVotes + nullVotes > totalVoters) {
            throw new IllegalArgumentException("Total votes cannot exceed total voters.");
        }
        this.totalVoters = totalVoters;
        this.validVotes = validVotes;
        this.blankVotes = blankVotes;
        this.nullVotes = nullVotes;
    }

    /**
     * Calculates the percentage of valid votes.
     * @return the percentage of valid votes.
     */
    public double validVotesPercentage() {
        return (double) validVotes / totalVoters * 100;
    }

    /**
     * Calculates the percentage of blank votes.
     * @return the percentage of blank votes.
     */
    public double blankVotesPercentage() {
        return (double) blankVotes / totalVoters * 100;
    }

    /**
     * Calculates the percentage of null votes.
     * @return the percentage of null votes.
     */
    public double nullVotesPercentage() {
        return (double) nullVotes / totalVoters * 100;
    }
}
