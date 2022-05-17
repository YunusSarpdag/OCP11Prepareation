package com.ocp.hazırlık.bir.javaOOP;

public class Outher {
    private String name ="Alice";
    private static String name2 ="Alice";
    class Inner{
        /*public static void show(){
            // Inner class static fieldı olamaz sadece static final olabilir
        }*/
        //static int testStatic = 5;
         static final int testFinal =0;
         private String name = "Freed";
         void write(){
             System.out.println(name);
        }
    }

    static class InnerStatic{
        static int testStatic = 5;
        static void test(){
            System.out.println();
            //System.out.println(name); static variable erişelibilr static olmaya compiker hatası verir
        }
        void test2(){

        }
    }
    public static void main (String arg[]){
        Outher ou = new Outher();
        Inner i = ou.new Inner();
        i.write();
    }

    private void testInnerLocalVariable(){
        int i = 5;
        Runnable r = new Runnable(){

            @Override
            public void run() {
                System.out.println (i);
                // local annomis class ta kullandıgımız variable ya final olucak yada effectively final olucak
                //System.out.println(i++);
            }
        };
    }
}
