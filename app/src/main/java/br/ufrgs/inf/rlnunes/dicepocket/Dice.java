package br.ufrgs.inf.rlnunes.dicepocket;

import java.util.Random;

/**
 * Created by Ruan on 23/05/2015.
 */
public class Dice {
    private Integer faces;

    public Dice() {
        this.faces = 6;
    }

    public Dice(int nunOfFaces) {
        this.faces = nunOfFaces;
    }

    public int roll() {
        Random randomizer = new Random();
        return (randomizer.nextInt(faces)) + 1;
    }
}
