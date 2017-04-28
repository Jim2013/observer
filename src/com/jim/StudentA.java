package com.jim;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jim on 2017/4/28.
 */
public class StudentA implements Observer {
    private String time;

    /**
     * 重写接口Observer的update方法
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        this.time = String.valueOf(arg);
        System.out.println("学生A收到考试时间为:" + this.time);
    }
}
