public class VariablesAndOperators {
    public static void main(String[] args) {
//        int myInt = 5555;
//        short myShort = 10;
//        long myLong = 55555555;
//
//        double myDouble = 22.22;
//        float myFloat = 223.22f;
//
//        char b = 'g';
//        boolean c = true;
//
//        byte e = 100; //-128-127
//
//        System.out.println(myFloat);
////
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (b--));
        // Проверяем разницу в d++ и ++d
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));

        System.out.println();

        int e = 10;
        int f = 20;
        System.out.println("e == f = " + (e == f) );
        System.out.println("e != f = " + (e != f) );
        System.out.println("e > f = " + (e > f) );
        System.out.println("e < f = " + (e < f) );
        System.out.println("e >= f = " + (e >= f) );
        System.out.println("f <= e = " + (e <= f) );
    }



}
