package com.learn.impl;

import com.learn.Log;

public class Logback implements Log {

    public void log(String info) {
        System.out.println("Logback: "+info);
    }
}
