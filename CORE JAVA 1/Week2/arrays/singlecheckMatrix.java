
package Week2.arrays;

public class singlecheckMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {1,0,0},
                {0,2,0}
        };

        try {
            checkAllMatrices(arr);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    static void checkAllMatrices(int[][] a) throws Exception {


        int rows = a.length;
        int cols = a[0].length;

        boolean isNull = true;
        boolean isIdentity = true;
        boolean isDiagonal = true;

        for (int i = 0; i < rows; i++) {
            

            for (int j = 0; j < cols; j++) {

                if (a[i][j] != 0)
                    isNull = false;

                if (rows == cols) {
                    if ((i == j && a[i][j] != 1) ||
                        (i != j && a[i][j] != 0))
                        isIdentity = false;

                    if (i != j && a[i][j] != 0)
                        isDiagonal = false;
                }
            }
        }


        if (rows == 1 && cols == 1)
            System.out.println("Singleton Matrix");

        if (isNull)
            System.out.println("Null Matrix");

        if (isIdentity)
            System.out.println("Identity Matrix");

        if (isDiagonal)
            System.out.println("Diagonal Matrix");

        if (cols == 1)
            System.out.println("Column Matrix");

        if (rows == 1)
            System.out.println("Row Matrix");

        if (rows == cols)
            System.out.println("Square Matrix");
        else
            System.out.println("Rectangular Matrix");
    }
}
