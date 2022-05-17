package com.ocp.hazırlık.bir.javaOOP;

import java.util.*;

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
}

public class JavaArrays_ {
    public static void addArr(Object[] arr){
        arr[0]= 12;
    }

    public static void main(String[] args) {
        String sArr[] = new String[3];
        //addArr(sArr); // runtime error
        sArr[0] = "A";
        sArr[1] = "B";

        String sArr1[] = new String[3];
        sArr1[1] = "A";
        sArr1[0] = "B";

        System.out.println(Arrays.equals(sArr1 ,sArr)); // false çünkü aynı indice bakıyor
        System.out.println(Arrays.hashCode(sArr));
        System.out.println(Arrays.hashCode(sArr1));

        sArr1[0] = "A";
        sArr1[1] = "B";

        System.out.println("****************");
        System.out.println(Arrays.equals(sArr1 ,sArr)); // true çünkü aynı indice bakıyor hascode aynı cünkü bu noktda equelas aynı döndü
        System.out.println(Arrays.hashCode(sArr));
        System.out.println(Arrays.hashCode(sArr1));


        List<String> sList = List.of("A" , "B");
        //sList.set(0,"C"); runtimeda hata alır


        Student s1 = new Student("Yunus");
        Set<Student> s= new HashSet<>();
        s.add(s1);
        s.add(new Student("Yunus")); // objeler farklı referanslara point ettigi için aynı objeyi ekledi eger equelas ve hascode override etseydik bu olmicaktı
        System.out.println(s.size());

        //var arr2 = {"Ali"}; compiler error alır new eklemem lazım
        var varList = List.of(s); // ok çünkü typ belli

        var arrr1 = List.of(1,2);
        var arrr2 = List.copyOf(arrr1);
        var arrr3 = new int[]{1,2};
        var arrr4 = Arrays.copyOf(arrr3 , arrr3.length);
        var arrr5 = new ArrayList<>(arrr2);

        System.out.println("---------");
        System.out.println(arrr1 == arrr2);
        System.out.println(arrr3 == arrr4);
        System.out.println(arrr1 == arrr5);
    }

    static public void test(){
       String [][] arr = new String[5][];
       String arr1[] = new String[2];
       String arr2[] = new String[4];
       arr[0] = arr1;
    }

}
