package javabasic_02.day06_0730;

public class PrimitiveEqualType {

    public static void main(String[] args) {

        // 정수형 배열 선언
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // 정수형 배열 메모리 생성
        arr1 = new int[3];
        arr2 = new int[3];
        arr3 = new int[3];

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);

        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        arr1[1] = 2;
        arr1[0] = 1;
        arr1[2] = 3;
        System.out.println("=========================");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("=========================");

        // for 문을 통해 처리 가능
        // itar 자동완성
        for (int i = 0; i < arr1.length; i++) {
            int i1 = arr1[i];
            System.out.println(i1);
        }

        System.out.println("=========================");

        // itar 자동완성
        for (int i : arr1) {
            System.out.println(i);
        }

        // arr3에 값을 차례로 itar, iter 방식을 통해서 5, 6, 7 값을 할당하고, 할당한 값을 확인하는 iter, itar을 이용하여 확인

        // 내가 푼거
        arr3[0] = 5;
        arr3[1] = 6;
        arr3[2] = 7;

        System.out.println("=========================");

        for (int i = 0; i < arr3.length; i++) {
            int i1 = arr3[i];
            System.out.println(i1);
        }

        System.out.println("=========================");

        for (int i : arr3) {
            System.out.println(i);
        }

        // itar
        for (int i = 0; i < arr3.length; i++) {
            int i1 = arr3[i];

        }

        // iter
        for (int i : arr3) {

        }

        /// //////////////////
        System.out.println("============강사님 풀이========");
        // 강사님 풀이

        int vaule = 5;

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = vaule;
            vaule++;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);

        }

        System.out.println("===== 주소값 복사하여 다른 참조변수에 할당 =====");
        arr2 = arr3;
        System.out.println("=======주소값 비교=======");
        System.out.println(arr2 == arr3);

        System.out.println("============");

        for (int i : arr2) {
            System.out.println(i);
        }

        System.out.println("==============");

        for (int i = 0; i < arr2.length; i++) {
            int i1 = arr2[i];
            System.out.println(i1);
        }

    }

}
