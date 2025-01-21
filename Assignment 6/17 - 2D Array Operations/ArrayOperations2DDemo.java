/**
   This class is complete. Do not modify.
*/

public class ArrayOperations2DDemo
{
   public static void main(String[] args)
   {
      // Create a 2D int array.
      int[][] array = { { 2, 1, 9},
                         { 7, 3, 4 } };
      
      // Process the int array.
      System.out.println("Processing the int array.");
      System.out.println("Total : " +
                         ArrayOperations2D.getTotal(array));
      System.out.println("Average : " +
                         ArrayOperations2D.getAverage(array));
      System.out.println("Total of row 0 : " +
                         ArrayOperations2D.getRowTotal(array, 0));
      System.out.println("Total of row 1 : " +
                         ArrayOperations2D.getRowTotal(array, 1));
      System.out.println("Total of col 0 : " +
                         ArrayOperations2D.getColumnTotal(array, 0));
      System.out.println("Total of col 2 : " +
                         ArrayOperations2D.getColumnTotal(array, 2));
      System.out.println("Highest in row 0 : " +
                         ArrayOperations2D.getHighestInRow(array, 0));
      System.out.println("Highest in row 1 : " +
                         ArrayOperations2D.getHighestInRow(array, 1));
      System.out.println("Lowest in row 0 : " +
                         ArrayOperations2D.getLowestInRow(array, 0));
      System.out.println("Lowest in row 1 : " +
                         ArrayOperations2D.getLowestInRow(array, 1));
   }
}