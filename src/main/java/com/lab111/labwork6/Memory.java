package com.lab111.labwork6;

/**
 * Class Memory extends abstract class MySystem
 *
 * @author Vch_m
 * @version 1
 */
public class Memory extends MySystem {
    /**
     * @param s
     *            assigned with the field state
     * @param p
     *            assigned with the field power
     */
    public Memory(String s, int p) {
        this.state = s;
        this.power = p;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.lab111.labwork6.MySystem#getPower()
     */
    @Override
    protected void getPower() {
        System.out.println("Power of memory : " + this.power);

    }
}
