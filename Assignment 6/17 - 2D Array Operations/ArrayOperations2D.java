public class ArrayOperations2D {

    /*
     * Method to calculates and returns the sum of all of the numbers in the array
     */
    public static int getTotal(int[][] array) {
        int n = 0;
        for (int[] row : array) {
            for (int value : row) {
                n += value;
            }
        }
        return n;
    }

    /* Method to find the average of all the numbers in the array */
    public static double getAverage(int[][] array) {
        int arraySize = 0;
        int n = getTotal(array);

        for (int[] row : array) {
            arraySize += row.length;
        }

        return (double) n / arraySize;
    }

    /* Method to find the sum of numbers in a row */
    public static int getRowTotal(int[][] array, int i) {
        int rowTotal = 0;

        for (int value : array[i]) {
            rowTotal += value;
        }

        return rowTotal;
    }

    /* Method to find the sum of numbers in a column */
    public static int getColumnTotal(int[][] array, int i) {
        int columnTotal = 0;
        for (int[] row : array) {
            if (i < row.length) {
                columnTotal += row[i];
            }
        }
        return columnTotal;
    }

    /* Method to find the highest value in a row */
    public static int getHighestInRow(int[][] array, int i) {
        int highest = Integer.MIN_VALUE;
        if (i < array.length) {
            for (int value : array[i]) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }

    /* Method to find the lowest value in a row */
    public static int getLowestInRow(int[][] array, int i) {
        int lowest = Integer.MAX_VALUE;
        if (i < array.length) {
            for (int value : array[i]) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }

}