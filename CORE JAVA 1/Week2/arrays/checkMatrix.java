package Week2.arrays;

public class checkMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {1,0,0},
                {0,2,0}
        };
        try {
        if (isSingleton(arr))   System.out.println("Singleton Matrix");
        if (isNull(arr))        System.out.println("Null Matrix");
        if (isIdentity(arr))    System.out.println("Identity Matrix");
        if (isDiagonal(arr))    System.out.println("Diagonal Matrix");
        if (isColumn(arr))      System.out.println("Column Matrix");
        if (isRow(arr))         System.out.println("Row Matrix");
        if (isSquare(arr))      System.out.println("Square Matrix");
        if (isRectangular(arr)) System.out.println("Rectangular Matrix");
        }
        catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }

    static boolean isSingleton(int[][] a) {
        return a.length == 1 && a[0].length == 1;
    }

    static boolean isNull(int[][] a) {
        for (int[] r : a)
            for (int v : r)
                if (v != 0) return false;
        return true;
    }

    static boolean isIdentity(int[][] a) {
        if (a.length != a[0].length) return false;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                if ((i == j && a[i][j] != 1) ||
                    (i != j && a[i][j] != 0))
                    return false;
        return true;
    }

    static boolean isDiagonal(int[][] a) {
        if (a.length != a[0].length) return false;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                if (i != j && a[i][j] != 0) return false;
        return true;
    }

    static boolean isColumn(int[][] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i].length != 1) return false;
        return true;
    }

    static boolean isRow(int[][] a) {
        return a.length == 1;
    }

    static boolean isSquare(int[][] a) {
        return a.length == a[0].length;
    }

    static boolean isRectangular(int[][] a) {
        return a.length != a[0].length;
    }
}
