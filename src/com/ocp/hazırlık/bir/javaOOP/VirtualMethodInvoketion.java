package com.ocp.hazırlık.bir.javaOOP;

public class VirtualMethodInvoketion {
    static void doStatic(){
        System.out.println("Static paretnt");
    }

    void doNotStatic(){
        System.out.println("Not Static paretnt");
    }
}

class VıTest extends VirtualMethodInvoketion{
    static void doStatic(){
        System.out.println("Static child");
    }

    void doNotStatic(){
        System.out.println("Not Static child");
    }
}

class TestVmI{
    public static void main(String[] args) {
        VirtualMethodInvoketion v = new VıTest();
        v.doStatic();
        v.doNotStatic();
    }
}
