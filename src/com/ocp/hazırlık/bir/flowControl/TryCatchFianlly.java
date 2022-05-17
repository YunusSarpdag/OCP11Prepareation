package com.ocp.hazırlık.bir.flowControl;

import java.io.FileReader;
import java.io.IOException;


class Ex1 extends Exception{

}

class Ex2 extends Ex1{

}
public class TryCatchFianlly {
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("test");
        //fr1  = new FileReader("test"); // try with resorce final yada effectively final olmalıdır
        try(fr1; FileReader fr = new FileReader("test")){
            System.out.println("test");
        }
    }

    private static void testEx1() throws Ex1 {
        throw new Ex1();
    }

    private static void testEx2() throws Ex1 {
        throw new Ex2();
    }

    private static void textEx() throws Exception{
        testEx1();
        testEx2();
    }

    private static void textEx1() throws Ex1{
        testEx1();
        testEx2();
    }

    private static void textEx2() throws Ex1{
        try{testEx1();
        testEx2();}
        catch(Ex2 e){

        }
    }
}
