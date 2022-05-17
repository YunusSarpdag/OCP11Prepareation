package com.ocp.hazırlık.bir.staticAndInstances;

public class VariableInitilization {
    final static public int s;
    private String name;
    private int _a;
    static{
        System.out.println(VariableInitilization.s);
        s=5;
        System.out.println(VariableInitilization.s);
    }
    public static void main (String ... arg){
        String name = "Ali";
        System.out.println(name);
    }
}
