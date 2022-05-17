package com.ocp.hazırlık.bir.Scope;

import java.util.List;

interface TestGeneric{
    void testGen(List<String> s);
}

public class Scope implements TestGeneric{

    public Scope(){
        super();
    }

    public Scope(int x){
        super();
    }

    public void testGen(List<String> s){

    }

    final static void testFinal(){

    }
    int x = 5;
    class TestScope{
        // dışarıdaki xe erişemeyecegi için aynı isimde field tanımlayabilir
        int y=10 , x = 12;
    }

    public static void main(String [] args){
        GUNLER g = GUNLER.PZRTS;
        switch(g){
            case PZRTS: System.out.println("Pazartesi"); break;
            //Switch case enumla kullanırken casede yalın halini kullanmamız lazım
            //case GUNLER.SL: break;
            case SL: System.out.println("Salı");return;
            case CRS: System.out.println("Çarşamba"); //continue; continue kullanamayız compiler hata verir
        }
    }
}

enum GUNLER{
    PZRTS , SL , CRS;
}
