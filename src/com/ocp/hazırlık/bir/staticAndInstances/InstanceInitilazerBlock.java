package com.ocp.hazırlık.bir.staticAndInstances;

public class InstanceInitilazerBlock {
    int x = 5;
    public InstanceInitilazerBlock(){
        //this(x);
        test(5);
        System.out.println("5");
    }

    private void test(int x){

    }

    public InstanceInitilazerBlock(int x){

    }
}

class Ex extends InstanceInitilazerBlock{
    {
        System.out.println("11");
    }

    public Ex(){
        System.out.println("15");
    }

    public static void main (String [] args){
        System.out.println("19");
        Ex ex = new Ex();
    }
}

class One {
    static int x ;
    int y;
    {System.out.println("38"); ++x;  ++y;}
    static{x++;}
    One(){
        this(x++);
    }
    One(int x){
        System.out.println(x);
        System.out.println(this.x);
    }
    static {new One();}
    public static void main (String arg[]){

    }
}
