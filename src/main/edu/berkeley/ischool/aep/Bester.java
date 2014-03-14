package edu.berkeley.ischool.aep;

/**
 * Created by honestyhuang on 3/7/14 (Renu pair).
 */
public class Bester {
    private final Bestable[] thingsToCompare;

    public Bester(Bestable... thingsToCompare) {
        if (thingsToCompare == null) throw new NullPointerException();
        this.thingsToCompare = thingsToCompare;
    }

    public Bestable best() {
        Bestable champion = thingsToCompare[0];
        for (int i = 0; i < thingsToCompare.length; i++) {
            if (thingsToCompare[i].moreThan(champion))
                champion = thingsToCompare[i];
        }

        return champion;
    }
}
