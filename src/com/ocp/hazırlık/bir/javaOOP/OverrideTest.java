package com.ocp.hazırlık.bir.javaOOP;

class A{

}

class B extends A{

}

class C extends B{

}

class ex1 extends Exception{

}

class ex2 extends ex1{

}

class ex3 extends ex2{

}

public class OverrideTest {
    B test() throws ex2{
        return new B();
    }
}

class TestOveeride extends  OverrideTest{
    @Override
    public C test() throws ex3{
        return new C();
    }

    /*
    // hata alır cünkü daha yüksek bir exction fırlatamam
    C test() throws ex1{
        return new C();
    }*/

    /*
    // hata alır cünkü daha yüksek bir return type döneme
    A test() throws ex3{
        return new A();
    }*/
}
