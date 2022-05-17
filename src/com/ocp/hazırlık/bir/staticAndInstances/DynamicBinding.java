package com.ocp.hazırlık.bir.staticAndInstances;

public class DynamicBinding {
    int x = 100;

    int getX(){
        return x;
    }

    public void getInfo(){
        System.out.println("Parent");
    }
}

class X extends DynamicBinding{
    int x = 200;
    public void getInfo(){
        X x = new X();
        System.out.println(x.x);
        System.out.println(super.x);

        DynamicBinding b = this;
        System.out.println(b.x);
        System.out.println(b.getX());

    }

   /* void testOverride(int a){
        System.out.println("29");
    }*/

    /*
    void testOverride(Integer a){
        System.out.println("33");
    }

    void testOverride(long a){
        System.out.println("39");
    }*/

    /*
    void testOverride(List<Integer> a){
        System.out.println("33");
    }

    void testOverride(List<String> a){
        System.out.println("33");
    }*/

    void testOverride(Integer ... a){
        System.out.println("53");
    }

    void testOverride(int a , long y){
        System.out.println("57");
    }

    void testOverride(long a , int y){
        System.out.println("57");
    }
    public void testVarargs(String ... args){

    }

    static {
        if(true){
           // System.out.println(staticInt); // compiler hatası verir çünkü static bloklar sırayla execute olur define edilmemiş bir variable erişmeye alışıyoruz bu noktada
            System.out.println(X.staticInt); // bu ok cünkü class üzerinden gidiyor ancak daha alttaki blok çalışmadıgı için deger 0 olarak yazar
        }
    }
    static int staticInt = 5;

    public static void main (String arg[]){
        X xt= new X();
        xt.getInfo();
        DynamicBinding db = xt;
        db.getInfo();
        xt.testVarargs();
        xt.testOverride(3);
        //xt.testOverride(3 , 6); // compiler kesinlikle hangi methodu cagıracagını bilmelidir literlaler iki methoda uygun o noktada compiler error verir

    }
}

class StaticEx{
    static void staticTest(){

    }

    void testNonStatic(){
        staticTest();
        StaticEx.staticTest();
        this.staticTest();
        new StaticEx().staticTest();
    }
}
