package com.ocp.hazırlık.bir.variables;

public class String_StringBuilder {
    public static void main(String[] args) {
        //String s1 = 'A';
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "He" + "llo";
        String s4 = "He";
        s4 = s4 + "llo";
        final String s5="He";
        String s6 = s5+ "llo";
        System.out.println("s1 == s2 : " + (s1==s2));
        System.out.println("s1 == s3 : " + (s1==s3));
        System.out.println("s1 == s4 : " + (s1==s4));
        System.out.println("s1 == s6 : " + (s1==s6));  // true çünkü compiler String final literal gibi görür

        s4 = s4.intern();
        System.out.println("s1 == s4 after intern: " + (s1==s4));


        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.toString());
        sb.append("word");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.toString());
        System.out.println("After setLength");
        sb.setLength(5);  // text ifadeni alınması gereken kısmını degiştiri
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.toString());

        sb.setLength(12);  // saçma karakterler koydu ama allocate etti
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.toString());

        String se3="Hello";

    }

}
