package com.ocp.hazırlık.bir.javaOOP;

public enum Enums {
    MONDAY{
        @Override
        void test() {
            System.out.println("MONDAY A");
            test2();
        }
    },SUNDAY("Sunday Test"){
        @Override
        void test() {
            System.out.println("SUNDAY A");
            test2();
        }
    };
    public String fieldValue;
    Enums(String s){
        this.fieldValue = s;
    }
    Enums(){

    }

    abstract void test();
    void test2(){
        System.out.println("test 2");
    };
}

class TestEnums{
    public static void main(String[] args) {
        System.out.println(Enums.SUNDAY);
        System.out.println(Enums.SUNDAY.name());
        System.out.println(Enums.SUNDAY.fieldValue);
        System.out.println(Enums.MONDAY);
        System.out.println(Enums.MONDAY.name());
        System.out.println(Enums.MONDAY.fieldValue);
        System.out.println(Enums.valueOf("SUNDAY").fieldValue);
        Enums.valueOf("SUNDAY").test();
        Enums.valueOf("SUNDAY").test2();
        //System.out.println(Enums.valueOf("WEDNSDAY").fieldValue); // Olmayan enum yolladıgımız için runtimeda hata alır
    }
}
