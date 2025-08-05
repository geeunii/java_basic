package javabasic_02.day10_0805;

public class Ex08 {
    public static void main(String[] args) {
        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 87, 88, 93}};

        int totalSum = 0;
        double avg = 0.0;
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
                cnt++;
            }
        }

        avg = (double) totalSum /cnt;

        System.out.printf("합 : %d\n평균 : %.2f", totalSum, avg);



    }
}
