package samples;
// Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
// column is set to 0.
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {
    public static void main (String [] args) {
        int[][] matrix = new int [][] {
          {1, 2, 3},
          {4, 5, 0},
          {0, 8, 9}
        };
    
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> columns = new HashSet<Integer>();
    
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                // Store current row and column
                if (matrix[i][j] == 0) {
                    rows.add (i); // In a set, add will not replace an element
                    columns.add (j);
                }
            }
        }
        
        Iterator<Integer> r = rows.iterator();
        while (r.hasNext()) {
            Integer row = r.next();
            for (int i = 0; i < matrix[0].length; ++i) { // Iterate over the columns
                matrix [row][i] = 0;
            }
        }
        
        Iterator<Integer> c = columns.iterator();
        while (c.hasNext()) {
            Integer column = c.next();
            for (int i = 0; i < matrix.length; ++i) {
                matrix[i][column] = 0;
            }
        }
        
        
        // Just print out the final result
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                System.out.print (matrix[i][j] + "         ");
            }
            System.out.println ();
        }
    }
}
