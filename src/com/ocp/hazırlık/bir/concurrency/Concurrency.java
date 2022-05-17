package com.ocp.hazırlık.bir.concurrency;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

public class Concurrency {

    public static void main(String[] args) throws InterruptedException {

        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority() + " : " + i);
            }
        };
        r.run();  // önce main threa çalışacak çündü ikinci oluşturudugumuz treadin priorityisi düşük
        Thread t = new Thread(r);
        t.setPriority(4);
        t.start();
        Thread t2= new Thread(r);
        t2.setPriority(4);
        t2.start();
        t.join();  // t1 bitine kadar main treadi bekletiyor
        System.out.println("En son");
    }
}


class TestMyTask{
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.execute(() -> System.out.println("test exexute"));
        List<Future<String>> handle = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            handle.add(ex.submit(new MyTask()));
        }

        //ex.shutdown(); // taskların bitmesini bekleyerek kill etti
        //ex.shutdownNow(); // InterruptedExcetpiton ile çalışan taskları kill etti

        System.out.println("Taklar submid oldu");
        while(handle.size()>0){
            Iterator<Future<String>> ifs = handle.iterator();
            while(ifs.hasNext()){
                Future<String> fs = ifs.next();
                if(fs.isDone()){
                    ifs.remove();
                    try{
                        String jobRes = fs.get();
                        System.out.println("Job result ok : " + jobRes);
                    }catch(InterruptedException e){
                        System.out.println("InterruptedException");
                    }catch(ExecutionException e){
                        System.out.println("ExecutionException");
                    }catch(CancellationException e){
                        System.out.println("CancellationException");
                    }
                }
            }
        }
    }
}


class MyTask implements Callable<String>{
    private static int nextId = 0;
    private int jobId = nextId++;

    @Override
    public String call() throws Exception {
        System.out.println("Job : " + jobId +" : started");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(jobId + " shutdown req geldi");
            return jobId + "shutdown req geldi";
        }

        if(Math.random() < 0.7){
            System.out.println(jobId + " sql exception");
            throw new SQLException();
        }

        System.out.println(jobId + " job submitted");
        return jobId + " job submitted";
    }
}
