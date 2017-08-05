package io.github.ciscorucinski.hashcodeandequal;

public class Main {

    public static void main(String[] args) {

        MyType type1 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, "", null);
        MyType type2 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, "", null);

        MyType type3 = new MyType(true, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, "", null);
        MyType type4 = new MyType(true, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, "", null);

        MyType type5 = new MyType(false, (byte) 1, (char) 0, (short) 1, 1, 0, 0, 0, new int[]{0}, "", null);
        MyType type6 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0, 0}, "", null);

        MyType type7 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, "", new Object());
        MyType type8 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, "", new Object());

        MyType type9 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, "hello", null);
        MyType type10 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, "hello", null);


        System.out.println("t 1 = 2 -> " + type1.equals(type2));
        System.out.println("t 3 = 4 -> " + type3.equals(type4));
        System.out.println("f 1 = 4 -> " + type1.equals(type4));
        System.out.println("f 5 = 6 -> " + type5.equals(type2));
        System.out.println("f 1 = 6 -> " + type1.equals(type6));
        System.out.println("f 7 = 8 -> " + type7.equals(type8));
        System.out.println("t 9 = 10 -> " + type9.equals(type10));


    }

}
