package org.example;

import java.time.LocalTime;

public class HalloThread extends Thread{
    @Override
    public void run() {
        try {
            while (true){
                String tagesZeit = getTagesZeit();
                String halloMessage = getSayHallo(tagesZeit);
                System.out.println(halloMessage);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Hallo-Thread wurde unterbrochen.");
        }
    }

    private String getTagesZeit() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        if(hour >= 6 && hour < 12){
            return "Morgen";
        } else if(hour >= 12 && hour < 18){
            return "Tag";
        } else if(hour >= 18 && hour < 22){
            return "Abend";
        } else {
            return "Nacht";
        }
    }
    private String getSayHallo(String tagesZeit) {
        switch (tagesZeit) {
            case "Morgen":
                System.out.println("Guten Morgen!");
                break;
            case "Tag":
                System.out.println("Guten Tag!");
                break;
            case "Abend":
                System.out.println("Guten Abend!");
                break;
            case "Nacht":
                System.out.println("Gute Nacht!");
                break;
        }
        return tagesZeit;
    }
}
