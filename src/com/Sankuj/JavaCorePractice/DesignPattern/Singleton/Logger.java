package com.Sankuj.JavaCorePractice.DesignPattern.Singleton;

import java.util.LinkedList;
import java.util.List;

public class Logger {
    private final List<String> logs = new LinkedList<>();
    private static Logger instance = null;
    private static int count  = 0;

    private Logger(){
        count++;
    }

    public static Logger getInstance(){
       if(instance == null) {
            synchronized (Logger.class) {
               if (instance == null) {
                   instance = new Logger();
               }
           }
       }
       return instance;
    }

    public void warn(String message){
        logs.add(message);
    }

    public void getLogs(){
        System.out.println(count);
        //if(!logs.isEmpty()) logs.forEach(System.out::println);
    }
}
