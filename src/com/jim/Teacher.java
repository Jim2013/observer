package com.jim;

import java.util.Observable;

/**
 * Created by jim on 2017/4/28.
 */
public class Teacher extends Observable {
    private String time;

    /**
     * 更改考试时间
     *
     * @param time
     */
    public void change(String time) {
        this.time = time;
        setChanged();
        notifyObservers(time);
    }
}
