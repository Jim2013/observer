package com.jim;

public class Main {

    /**
     * 观察者模式简单DEMO
     *
     * @param args
     */
    public static void main(String[] args) {
        // write your code here
        Teacher teacher = new Teacher();
        StudentA a = new StudentA();
        StudentB b = new StudentB();
        teacher.addObserver(a);
        teacher.addObserver(b);

        teacher.change("4/17");

        System.out.println("临时有事,考试需要改期!");

        teacher.change("4/18");
    }
}
