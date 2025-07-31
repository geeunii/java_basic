package javabasic_02.day07_0731;

public class ArrayExam {
    public static void main(String[] args) {
        char[] c = {'A', 'P', 'P', 'L', 'E'};

        for (char c1 : c) {
            System.out.print(Character.toLowerCase(c1));
            System.out.println();
            // System.out.print(String.valueOf(c).toLowerCase());
        }

    }
}
