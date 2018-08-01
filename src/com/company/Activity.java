package com.company;

public abstract class Activity {
    public Activity() {
        onCreate();
    }

    abstract protected void onCreate();

    protected void setContentView() {
    }
}
