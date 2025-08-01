package javabasic_02.day08_0801.arraysEx;

import java.util.Arrays;

public class ArrayCopyEx {
    public static void main(String[] args) {
        int[] oldArray = {10, 20, 30, 40, 50};
        int[] newArray = new int[oldArray.length * 10];

        // for문 반복
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];

        }

        for (int i : newArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        // System.arraycopy() 이용
        int[] systemArray1 = new int[oldArray.length * 2];

        System.arraycopy(oldArray, 0, systemArray1, 0, oldArray.length);
        for (int i : systemArray1) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Arrays.copyOf() 이용
        int[] arraysCopyOf = new int[oldArray.length * 2];
        arraysCopyOf = Arrays.copyOf(oldArray, arraysCopyOf.length);
        System.out.print(Arrays.toString(arraysCopyOf));

    }
}
