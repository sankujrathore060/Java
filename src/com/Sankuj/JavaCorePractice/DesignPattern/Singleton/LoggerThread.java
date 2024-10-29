package com.Sankuj.JavaCorePractice.DesignPattern.Singleton;

public class LoggerThread extends Thread{
    public LoggerThread(String name){
        super(name);
    }
    @Override
    public void run() {
        Logger logger = Logger.getInstance();
        logger.warn("Invalid Type" + Thread.currentThread().getName());
        logger.getLogs();
    }
}
