package controller;

import controller.IController;

import java.util.Observable;

/**
 * 
 * @author mathi
 *
 */
public class Clock extends Thread {

    private long tickInterval = 100;

    /**
     * @author mathi
     */
    public Clock() {
        this.setTickInterval(tickInterval);

    }

    /**
     * @author mathi
     * @param tickInterval
     */
    public Clock(int tickInterval) {
        this.setTickInterval(tickInterval);

    }

    /**
     * @author mathi
     */
    public void run() {

            try {
                Thread.sleep(this.tickInterval);
            } catch (InterruptedException e) {
                System.err.println("Clock thread interrupted");
                e.printStackTrace();
            }

    }

 
    public long getTickInterval() {
        return tickInterval;
    }


    public void setTickInterval(long tickInterval) {
        this.tickInterval = tickInterval;
    }

   
    
}
