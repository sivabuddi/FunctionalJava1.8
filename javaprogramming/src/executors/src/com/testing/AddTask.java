package com.testing;

import java.util.concurrent.Callable;

public class AddTask implements Callable {
    private int x,y;

    public AddTask(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return x+y;
    }

}
