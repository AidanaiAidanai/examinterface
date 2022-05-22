package com.company;

public class Cat extends Animal implements Walkable, Eatable{
    @Override
    public void makeVoice(int a, String b) {
        System.out.println("make Voice");
    }

    @Override
    public void run() {
        System.out.println("cat can run");
    }

    @Override
    public int voice() {
        System.out.println("cat can eat");
        return 123;
    }


    @Override
    public void eates() {
        System.out.println("our cat eates so much");

    }
}
