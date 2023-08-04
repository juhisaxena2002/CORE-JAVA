// import java.util.Arrays;

// public class Row_colMatrix {
//     public static void main(String[] args) {
//          int arr[][] = {
//             {2,3,4,5},
//             {7,8,9,10},
//             {11,12,13,14}

            
//          };
//         System.out.println(Arrays.toString(search(arr, 14)));
//     }

//     static int[] search(int [][]matrix, int target){
//         int r = 0;
//         int c = matrix.length-1;
//         while(r<matrix.length && c>=0){
//             if(matrix[r][c]== target){
//                 return new int[]{r,c};
//             }

//             if(matrix[r][c] < target){
//                 r++;
//             }else{
//                 c--;
//             }
//         }
//         return new int []{-1,-1};

//     } 
// }


import java.util.Arrays;

public class Row_colMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
} 