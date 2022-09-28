package com.tingshulien.game.utility.utility;

public abstract class Utility {

    public static double cap(double score, double min, double max) {
        return Math.min(Math.max(score, min), max);
    }

    public static double normalize(double score, double min, double max) {
        return (score - min) / (max - min);
    }

}
