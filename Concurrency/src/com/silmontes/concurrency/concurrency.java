package com.silmontes.concurrency;

public class concurrency {
    public static void main(String[] args) {

        //Both loops are happening at the same time
       /*
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("Printing "+i+" in a worker thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();

        for(int i=0;i<5;i++){
            System.out.println("Printing "+i+" in a main thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        */


        //Exception

        int a=2;
        int b=0;
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){ // if we do not know the kinf of exception, we can use Exception. That one is general.
            System.out.println("B was 0");
        }

        String name = null;
        try{
            name.equals("Milly");
        }catch(NullPointerException e){
            e.printStackTrace(); // to print something in the console that can e useful in the application
            System.out.println("Name was null");
        }
    }
}
