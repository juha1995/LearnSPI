package com.learn.impl;

import com.learn.Log;

public class Log4j implements Log {

    public void log(String info) {
        System.out.println("Log4J: "+info);

    }
}
