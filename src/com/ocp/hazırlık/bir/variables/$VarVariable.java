package com.ocp.hazırlık.bir.variables;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class $VarVariable {
    //var x = "Hello"; // var local variable yada lambda variable olarak kullanılır
    public static void main(String[] args) {
        var x = "Hello";
        //x=99;  // Stringe int ataması yapılamaz

        //var arr = {1,2,3}; // array tipi byte int ve obje olabilir unambigitius tanım yapılmamalı
        var arr2 = new int[]{1,2,3};
        //var [] arr3 = new int[]{1,2,3}; var sagdaki tüm type ifade etmelidir
        //var x1 = 1 , y = 2; //  compound atama yapamayız sadece 1 variable tanımlayabilriz

        // method variable ve degişkenin tipi int literal olarak kullanılmış
        for(var i =0; i < 10; i++){
            System.out.print(i + " ");
        }

        try(var test = Files.newBufferedReader(Path.of("test"))){

        } /*catch (var e) {  // hata verir çünkü exception type atama yapamayız
            e.printStackTrace();
        }*/ catch (IOException e) {
           // e.printStackTrace();
            // valid çünkü exceptionın type artık biliyoruz
            var ex = e;
        }


        var r = true ? 99 : "A";
        if(r instanceof Serializable){
            System.out.println("Serializable");
        }

        if(r instanceof Comparable){
            System.out.println("Comparable");
        }



    }
    /*
    private static void testVar (var x){
        // compiler hata verir çünkü method invoke edilene kadar x type bilme imkanı yok
    }
     */
}
