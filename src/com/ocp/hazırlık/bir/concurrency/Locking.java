package com.ocp.hazırlık.bir.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Locking {

    static List<Boolean> b ;
    static {
        b = new ArrayList<Boolean>(); // happen before ilişkisi yaratarak kodun kill  olmasını engeller
        //b = new CopyOnWriteArrayList<>();
    }
    public static void main(String[] args) throws InterruptedException{
        test();
        final int arr[] ={0};
        new Thread(()->{
           while(arr[0] < 4){
               System.out.println("Arr  : " + arr[0]);
           }
        }).start();

        new Thread(()->{
           for(int i =0; i< 5; i++){
               arr[0]=i;
           }
        }).start();
    }

    static void test() throws InterruptedException{
        new Thread(() -> {
            while(b.isEmpty() || !b.remove(0)){

            }
            System.out.println("Breaking loop");
        }).start();
        System.out.println("method started");
        Thread.sleep(1000);
        b.add(Boolean.TRUE);
        System.out.println("Breaking method");
    }
}
