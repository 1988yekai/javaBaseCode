package com.multiThreadLearn;

import java.util.concurrent.TimeUnit;

/**
 * Created by yek on 2019-02-02.
 */
public class SuspendTest {
    public static void main(String[] args) throws Exception {
        Suspend suspend = new Suspend();
        new Thread(suspend).start();
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("suspend===");
        suspend.setSuspend(true);
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        System.out.println("restart ===");
        suspend.restart();
    }
}

class Suspend implements Runnable {
    private boolean isSuspend = false;
    private Object lock = new Object();

    public boolean isSuspend() {
        return isSuspend;
    }

    public void setSuspend(boolean suspend) {
        isSuspend = suspend;
    }

    public void restart() {
        synchronized (lock) {
            lock.notify();
            this.isSuspend = false;
        }
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            synchronized (lock) {
                try {
                    System.out.println("==: " + i++);
                    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
                    if (isSuspend) {
                        lock.wait();
                    }
                    // do something
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
