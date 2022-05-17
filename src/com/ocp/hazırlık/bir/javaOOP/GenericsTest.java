package com.ocp.hazırlık.bir.javaOOP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        new ArrayList<>(List.of("")).add("5");
        //new ArrayList<>(List.of("")).add(5);  // string liste int ekleyemem stringden başka bir şey ekleyeyemme
        List l = new ArrayList<String>();
        l.add(LocalDate.now());
        List<String> s = l;
        //String ss = s.get(0); // class cast exception alır
        test(new ArrayList<String>());
        //test2(new ArrayList<String>()); sadece charseunece listi gecebilrim polimorphisim yok
    }

    private static void test(List<? extends CharSequence> cls){

    }
    private void test2(List<CharSequence> cls){

    }

}
