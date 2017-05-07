package edu.ncsu.monopoly;

import java.util.Comparator;

public class Criteria implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {

        return o1.getWonGames() - o2.getWonGames();

    }
}
