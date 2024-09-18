package org.example;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Runnable halloRunnable = new HalloRunnable();
        Thread halloThread = new Thread(halloRunnable);
        halloThread.start();



       /* HalloThread halloThread = new HalloThread();
        halloThread.start();
*/


       /* Thread halloThread = new Thread(()-> {
            try {
                while (true) {
                    Supplier<String> tagesZeitenSupplier =() -> {
                        LocalTime now = LocalTime.now();
                        int hour = now.getHour();

                        if (hour >= 6 && hour < 12) {
                            return "Morgen";
                        }else if (hour >= 12 && hour < 18) {
                            return "Nachmittag";
                        }
                        else if (hour >= 18 && hour < 24) {
                            return "Abend";
                        } else {
                            return "Nacht";
                        }
                    };
                    Consumer<String> halloConsumer = System.out::println;


                    String tagesZeit = tagesZeitenSupplier.get();

                    String halloMessage="";

                    if(tagesZeit.equals("Morgen")){
                        halloMessage = "Guten Morgen!";
                    }
                    else if(tagesZeit.equals("Nachmittag")){
                        halloMessage = "Guten Tag!";
                    }
                    else if(tagesZeit.equals("Abend")){
                        halloMessage = "Guten Abend!";
                    }
                    else {
                        halloMessage = "Guten Nacht!";
                    }

                    halloConsumer.accept(halloMessage);

                    Thread.sleep(5000);
                }

            } catch (InterruptedException e) {
                System.out.println("Hallo-Thread wurde unterbrochen.");
            }

        });*/

        //halloThread.start();



    }




}