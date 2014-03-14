package edu.berkeley.ischool.aep;
/* * gives the probability of an event*/


public class Chance {
    private final double chance_prob;
    public Chance(double prob){
        chance_prob = prob;

    }


    public Chance not(){
//        System.out.println(this.chance_prob);
        //immutability - instead of changing the original object, we need to create a new object
        Chance something = new Chance(1-this.chance_prob);
        return something;
    }

    @Override
    public boolean equals(Object other) {
//        return (this.chance_prob ==((Chance)other).chance_prob);
        if (other == this) return true; //default implementation of equals
        if (!(other instanceof Chance)) return false;
        return chance_prob == ((Chance) other).chance_prob;

    }

    @Override
    public int hashCode() {
//        return super.hashCode();    //To change body of overridden methods use File | Settings | File Templates.

        long longBits = Double.doubleToLongBits(chance_prob);
        return (int)(longBits^(longBits>>>32));
    }



}