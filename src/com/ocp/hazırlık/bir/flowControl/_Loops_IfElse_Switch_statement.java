package com.ocp.hazırlık.bir.flowControl;

public class _Loops_IfElse_Switch_statement {
    public static void main(String[] args) {
        for(int i=0 , y =0; i < 10; i++){

        }
        /*
        // compile olmaz çükü 2. kez type tanımı yaptım
        for(int i=0 , int y =0; i < 10; i++){

        }*/

        for(int i =0; i < 3;i++){
            System.out.println(i++);
            continue;
          //  i++;  // unreachable code hata verir her zaman
        }

        // this code compli olur çünkü mylooo için scopelar farklı en sonsuz döngye girer
       /* myloop:while(true){
            int myloop=0;
        }*/

        // satır hiç bir şey yaz çüünkü else en yakın if için çalışır
        int  x = 40;
        if(x > 50)
            if(x<90)
                System.out.println("Too big");
        else
            System.out.println("Not to big");


        final int p = 10;
        //constant expression daima false dönüyor ve compiler whiledaki kod için unreachable oldgunu bliyor hata veriyor
        /*while(p > 50)
            System.out.println("test");*/


        if(false){
            System.out.println("Ok");
        }


        final boolean b = false;
        if(b){
            System.out.println("Ok");
        }
    }
}
