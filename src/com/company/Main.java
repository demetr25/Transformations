package com.company;

public class Main {

    public static void main(String[] args) {
        byte b = 96;
        short s = b;
        int i = s;
        long l = i;
        double d = i;
        float f = s;
        double d2 = f;
        char c = 'v';
        int i2 = c;
        System.out.println("1)byte->short->int->long"+" "+"b"+" "+"="+" "+b+" "+"->"+" "+"s"+" "+"="+" "+s
                +" "+"->"+" "+"i"+" "+"="+" "+i+" "+"->"+" "+"l"+" "+"="+" "+l+"\n");
        System.out.println("2)int->double "+"i"+" "+"="+" "+i+" "+"->"+" "+"d"+" "+"="+" "+d+"\n");
        System.out.println("3)short->float->double "+"s"+" "+"="+" "+s+" "+"->"+" "+"f"+" "+"="+" "+f+" "
        +"->"+" "+"d"+" "+"="+" "+d2+"\n");
        System.out.println("4)char->int "+"c"+" "+"="+" "+c+" "+"->"+" "+"i"+" "+"="+" "+i2);
    }
}
