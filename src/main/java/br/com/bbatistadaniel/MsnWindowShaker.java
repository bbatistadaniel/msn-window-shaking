package br.com.bbatistadaniel;

import java.awt.Point;

public class MsnWindowShaker {

    public static void shakeWindow(java.awt.Window windowToShake, int shakeFactor, int durationInMilliseconds, int intervalBetweenMovingInMilliseconds) {

        java.lang.Thread durationTimeThread = new java.lang.Thread(() -> {
            try {
                java.lang.Thread.sleep(durationInMilliseconds);
            } catch (Exception _) {
                java.lang.Thread.currentThread().interrupt();
            }
        });
        durationTimeThread.start();

        java.awt.Point[] movements = new java.awt.Point[]{
                new java.awt.Point(shakeFactor, 0),
                new java.awt.Point(0, -shakeFactor),
                new java.awt.Point(-shakeFactor, 0),
                new java.awt.Point(0, shakeFactor)
        };

        while (durationTimeThread.isAlive()) {
            for (java.awt.Point move : movements){
                moveWindow(windowToShake, move.x, move.y);
                sleep(intervalBetweenMovingInMilliseconds);
            }
        }
    }

    public static void moveWindow(java.awt.Window windowToMove, int x, int y) {
        java.awt.Point initialPoint = windowToMove.getLocation();
        windowToMove.setLocation(new Point(initialPoint.x + x, initialPoint.y + y));
    }

    private static void sleep(int milliseconds){
        try{
            java.lang.Thread.sleep(milliseconds);
        }catch (InterruptedException _){
            java.lang.Thread.currentThread().interrupt();
        }
    }

}