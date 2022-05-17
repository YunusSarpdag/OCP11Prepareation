package com.ocp.hazırlık.bir.Functionalnterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalInterfaces {
    public static void main (String ... args){
        Function<Integer , Integer> f = (i1) -> {return ++i1;};
        System.out.println(f.apply(3));

        List<String> list = new ArrayList<>();
        list.add("Yunus");
        list.stream().flatMap(Stream::of).forEach(System.out::println);

        Map<String , Integer> map = new HashMap();
        map.put("yunus" , 1);
        map.put("sarp" , 2);
        map.entrySet().stream().filter(e -> e.getKey().equals("yunus")).forEach(System.out::println);

        IntStream.iterate(1 , v -> v< 1000 ,v-> v+2).limit(20).takeWhile(i -> i<10).forEach(System.out::print);

        System.out.println("=====================");
        IntStream.range(1,10).peek( i -> System.out.println(" peek" +i));
        IntStream.range(1,10).peek( i -> System.out.println("peek" +i)).forEach(System.out::print);
        IntStream.range(1,10).peek( i -> System.out.println("peek" +i)).count();

        Stream.generate(() -> Math.random()).mapToInt(x -> (int)(4*x)).filter(x-> x>0).allMatch(x -> x %2 ==0);
        new Random().doubles(-1 ,1).limit(10).average().ifPresent(System.out::println);
        System.out.println(IntStream.range(1, 10).reduce(0 , (a,b) -> a+b));
        System.out.println(IntStream.range(1, 1).reduce(5, (a,b) -> a+b));

        map.entrySet().stream().map(e -> e.getKey()).collect(Collectors.groupingBy(e -> e.length())).forEach((k ,v)
                -> System.out.println("key : " + k + " value : " + v));

        map.entrySet().stream().map(e -> e.getKey()).collect(Collectors.partitioningBy(k -> k.length() > 4)).
                forEach((k,v) -> System.out.println(k + " key and value = " + v));

    }
}
