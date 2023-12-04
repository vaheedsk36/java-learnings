public class Arrays {
    public static void main(String[] arg) {
        // simple 1d array
        int num[] = { 1, 2, 3, 4, 5 };
        System.out.println(num[0]);

        // Array traversal of 1d array
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();

        // multidimensional array (m x n)
        int multiArr[][] = new int[3][4];

        // Insert values in array for multi dimensional array

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                multiArr[i][j] = (int) (Math.random() * 10);

            }

        }

        // Array traversal for multi dimensional array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(multiArr[i][j]);

            }
            System.out.println();

        }

    }

}
