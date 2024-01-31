package Lesson12Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
//        int[][] matrix = {{3, 5, 7, 9}, {2, 4, 6, 8}, {1, 2, 3, 4}};
////        int[][] matrix1 = new int[3][];
//
//
//        for (int[] ints : matrix) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        int[][] jagged;
        jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[4];

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = (int) (Math.random() * 10);
                System.out.print(jagged[i][j] + " , ");
            }
            System.out.println();
        }
    }


}

