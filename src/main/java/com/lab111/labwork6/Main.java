package com.lab111.labwork6;

/**
 * The class Lab6 contained the main method
 *
 * @author Vch_m
 * @version 1
 */
public class Main {

    public static void main(String[] args) {
        MySystem processor = new Processor(MySystem.state2, 100);
        MySystem videoCard = processor.setNextInChain(new VideoCard(
                MySystem.state2, 80));
        MySystem memory = videoCard.setNextInChain(new Memory(MySystem.state2,
                50));
        processor.writePower();
    }
}
