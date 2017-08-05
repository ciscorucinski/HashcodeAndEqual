package io.github.ciscorucinski.hashcodeandequal;

public class Main {

    public static void main(String[] args) {

        MyType type1 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{null},"", null);
        MyType type2 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{null},"", null);

        MyType type3 = new MyType(true, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{null}, "", null);
        MyType type4 = new MyType(true, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{null}, "", null);

        MyType type5 = new MyType(false, (byte) 1, (char) 0, (short) 1, 1, 0, 0, 0, new int[]{0}, new Object[]{null}, "", null);
        MyType type6 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0, 0}, new Object[]{null}, "", null);

        MyType type7 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{null}, "", new Object());
        MyType type8 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{null}, "", new Object());

        MyType type9 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{null}, "hello", null);
        MyType type10 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{null}, "hello", null);

        MyType type11 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{null},       "hello", null);
        MyType type12 = new MyType(false, (byte) 0, (char) 0, (short) 0, 0, 0, 0, 0, new int[]{0}, new Object[]{new Main()}, "hello", null);


        System.out.println("1 = 2 -> expects true, calculated as " + type1.equals(type2));
        System.out.println("3 = 4 -> expects true, calculated as " + type3.equals(type4));
        System.out.println("1 = 4 -> expects false, calculated as " + type1.equals(type4));
        System.out.println("5 = 6 -> expects false, calculated as " + type5.equals(type2));
        System.out.println("1 = 6 -> expects false, calculated as " + type1.equals(type6));
        System.out.println("7 = 8 -> expects false, calculated as " + type7.equals(type8));
        System.out.println("9 = 10 -> expects true, calculated as " + type9.equals(type10));
        System.out.println("11 = 12 -> expects false, calculated as " + type11.equals(type12));

    }

}
