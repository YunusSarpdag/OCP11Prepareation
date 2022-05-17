package com.ocp.hazırlık.bir.variables;
import java.util.*;
import java.lang.*;

public class VariableAssignment {

    public static void main(String[] args) {
        int i = 99;
       System.out.println(++i);
       int j = 99;
       System.out.println(j++);
       int k=99;
       //System.out.println(++k++); // compile olmaz

        int l = 1;
       // int m = 100/--l;  // divide by 0 exception
       // System.out.println(m);


        ////  % mod degildir
        for(int n = 0; n < 15; n++) {
            int[] arr = {1, 2, 3};
            int key = (int) (Math.random() * 101) - 50;
           // System.out.println(arr[key % arr.length]); // Index -2 out of bounds for length 3 % signı soldan alır sol taraf negatifse sonuc negatiftir
        }

        int [] ia1={1,2,3};
        int [] ia2={1,2,3,4};
        int [] ia3 = ia1;
        int x =0;
        System.out.println((ia3=ia2)[x=3]);  // assignmet sonuc = 4; ia2 ia3'e atandı ve x 3 atandı

        short b = 3 + 5;
        short a = 3;
        short c = 5;
        //short d = a + c; int convert
        final short d = 4;
        final short e = 4;
        short f = d+e;
        final int g = 99; // value final oldugu için comiper bunu literal gibi görür
        byte h = g;
        int  o = 4;
        // byte t = o;  compiler hata verir type cast
        final long p = 12;
        //byte t =p; finalı literal gibi görmesi için int ve ya dah küçük olması gerek
        //byte t = true ? d : h; final degişken int olursa bu eşitlik olur
        byte t = true ? g : h; // final degişken int type bu yuzden sıkıntı yok
        byte q = true? 5: h;
        //byte qr = true ? 300:h;  // 300 byte sıgmaz çünkü
        //List<int> intList ; genericler obje ile çalışır primitve compiler erro veririr
        List<Integer> list = new ArrayList<>();
        int ij = 12;
        list.add(ij); // autoboxing
        Integer.compare(4,4);
        Integer wrapInt = 4;

        int ie = 0;
        int[] arr = new int[]{0,1,2,3};
        arr[++ie] = arr[++ie] + arr[ie];
        // i = 1 çünkü atama soldan saga olur o yüzden 1 numaralı elema degişti
        System.out.println(Arrays.toString(arr));

    }
}
