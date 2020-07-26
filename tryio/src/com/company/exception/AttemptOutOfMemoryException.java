package com.company.exception;

public class AttemptOutOfMemoryException {

    public void r() {
        for (int i = 0; true; ++i) {
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(10000000);

                    } catch (InterruptedException e) {
                    }
                }
            }.start();
            System.out.println("Thread " + i + " was created");
        }
    }
}
