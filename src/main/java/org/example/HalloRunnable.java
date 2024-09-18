package org.example;

import java.time.LocalTime;

public class HalloRunnable implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                String tagesZeit = getTagesZeit();
                String halloMessage = getSayHallo(tagesZeit);
                System.out.println(halloMessage);
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println("Fehler beim Ausgeben der Nachricht: " + e.getMessage());
        }
    }

    private String getTagesZeit() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        if (hour >= 6 && hour < 12) {
            return "Morgen";
        } else if (hour >= 12 && hour < 18) {
            return "Mittag";
        } else {
            return "Abend";
        }
    }

    private String getSayHallo(String tagesZeit) {
        switch (tagesZeit) {
            case "Morgen":
                return "Guten Morgen!";
            case "Mittag":
                return "Guten Tag!";
            case "Abend":
                return "Guten Abend!";
            default:
                return "Hallo!";
        }
    }
}
