package com.company;

public interface Walkable{
    public final static int a = 12;
    String b = "Aidana";
     final static int c = 34;

    public default int voice(){
        System.out.println("hello world");
        return 9;
    }

    void makeVoice(int a, String b);

    default void run(){
        System.out.println("it is a default method");
    }

    static void eat(int a){
        System.out.println(a+2);
    }
}
