package com.ocp.hazırlık.bir.javaOOP;

public class CastInterface {
}

interface CastI{

}

final class CastIn{

}

class Test{
    public static void main(String[] args) {
        CastInterface ci = new CastInterface();
        CastI c = (CastI) ci; // compile olur cümkü CastInterface child class olabilri ve o interfaci implement edebilr ancak suan etmedigi için runtimeda hata alır
        CastIn cin = new CastIn();
        //CastI c1 = (CastI) cin; // compile olmaz cünkü clasın childı olamaz
    }
}