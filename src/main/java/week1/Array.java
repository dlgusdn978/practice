package week1;

public class Array {
    public static void main(String[] args) {
        // 다차원 배열 스캔
        // 가상의 3행 3열짜리 2차원 배열
        int[][] scoreMatrix = {
                {80, 90, 85},
                {70, 60, 75},
                {95, 92, 100}
        };

        int sum = 0;
        double average = 0.0;

        for(int i=0; i<scoreMatrix.length; i++){
            for(int j=0; j<scoreMatrix[i].length; j++){
                sum += scoreMatrix[i][j];
            }
        }
        average = (double) sum / (scoreMatrix.length*scoreMatrix[0].length);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);


        System.out.println("\n=== Mission 2: Checking Array Length Concept ===");

        // 자바의 가변 배열 구조
        int[][] irregularArray = {
                {10, 20},
                {30, 40, 50, 60},
                {70}
        };

        System.out.println("Total Rows: " + irregularArray.length);

        System.out.println("Row 1 Columns: " + irregularArray[1].length );

        System.out.println("Row 2, Index 0 Value: " + irregularArray[2][0] );
    }
}
