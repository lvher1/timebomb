package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*int i=0;
        for(i=10;i>=0;i--){
            System.out.println(i);

        }

        System.out.println("Boooooooooooooooooooooom!");
        */

        Timer timer = new Timer();
        TimerTask work_timer = new TimerTask() {
            int i = 10;
            @Override

            public void run() {

                System.out.println(i);
                i--;
            }
        };
        timer.schedule(work_timer,10000);
    }
}
