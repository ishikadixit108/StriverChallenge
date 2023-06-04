import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {

        int r = matrix.length;
        int c = matrix[0].length;
        //what we can do is take two arrays with the size of rows(r) and columns(c) respectively
        int[] rows = new int[r];
        int[] cols = new int[c];
        //initialise both arrays with -1
        Arrays.fill(rows,-1);
        Arrays.fill(cols,-1);
        //traverse the matrix and look for presence of zeroes , if there is any zero , then , insert 0 in both rows[i] and cols[j]
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows[i]=0;
                    cols[j]=0;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(rows[i]==0||cols[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }

}