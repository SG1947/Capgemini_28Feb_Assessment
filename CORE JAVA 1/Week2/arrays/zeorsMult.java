package Week2.arrays;

// find 0 elements and their coordinates and make the particular rows and columns zeros
public class zeorsMult {

    public static void main(String[] args) {

        int[][] arr = {{1, 4, 7}, {2, 0, 8}, {3, 6, 9}};

        int c = count(arr); // number of zeros
        Coordinate[] res = new Coordinate[c];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    Coordinate cor = new Coordinate(i, j);
                    res[index] = cor;
                    index++;
                }
            }
        }

        // Print result
        for (int i = 0; i < res.length; i++) {
            System.out.println("Row: " + res[i].row + ", Column: " + res[i].column);
        }
    }

    public static int count(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

class Coordinate {
    int row;
    int column;

    Coordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }
}




//package Week2.arrays;
//
////find 0 elements and their coordinates and make the particular rows and columns zeros
//public class zeorsMult {
//
// public static void main(String[] args) {
//
//     int[][] arr = {{1, 4, 7}, {2, 0, 8}, {3, 6, 9}};
//
//     int c = count(arr); // number of zeros
//     Coordinate[] res = new Coordinate[c];
//
//     int index = 0;
//     for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[0].length; j++) {
//             if (arr[i][j] == 0) {
//                 res[index] = new Coordinate(i, j);
//                 index++;
//             }
//         }
//     }
//
//     // Make rows and columns zero
//     makeZero(arr, res);
//
//     // Print final array
//     printArray(arr);
// }
//
// public static int count(int[][] arr) {
//     int count = 0;
//     for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[0].length; j++) {
//             if (arr[i][j] == 0) {
//                 count++;
//             }
//         }
//     }
//     return count;
// }
//
// // Zero the rows and columns of found coordinates
// public static void makeZero(int[][] arr, Coordinate[] coords) {
//
//     for (Coordinate c : coords) {
//
//         // zero entire row
//         for (int j = 0; j < arr[0].length; j++) {
//             arr[c.row][j] = 0;
//         }
//
//         // zero entire column
//         for (int i = 0; i < arr.length; i++) {
//             arr[i][c.column] = 0;
//         }
//     }
// }
//
// // Print matrix
// public static void printArray(int[][] arr) {
//     for (int i = 0; i < arr.length; i++) {
//         for (int j = 0; j < arr[0].length; j++) {
//             System.out.print(arr[i][j] + " ");
//         }
//         System.out.println();
//     }
// }
//}
//
//class Coordinate {
// int row;
// int column;
//
// Coordinate(int row, int column) {
//     this.row = row;
//     this.column = column;
// }
//}
