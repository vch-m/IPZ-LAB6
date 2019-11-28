package com.lab111.labwork6;

/**
 * Abstract class MySystem
 *
 * @author Vch_m
 * @version 1
 */
public abstract class MySystem {
    /**
     * The static field state1
     */
    public static String state1 = "OFF";
    /**
     * The static field state2
     */
    public static String state2 = "ON";
    /**
     * The field state
     */
    public String state;
    /**
     * The field power which contained power value of object
     */
    public int power;

    /**
     * The field nextInChain contained link to the next object in chain of
     * responsibility
     */
    protected MySystem nextInChain;

    /**
     * @param sys
     *            assigned with the field nextInChain
     * @return link of object MySystem
     */
    public MySystem setNextInChain(MySystem sys) {
        nextInChain = sys;
        return sys;
    }

    /**
     * The method writePower()
     */
    public void writePower() {
        if (state.equals("ON")) {
            getPower();
        }
        if (nextInChain != null) {
            nextInChain.writePower();
        }
    }

    /**
     * The abstract method getPower;
     */
    abstract protected void getPower();
}
