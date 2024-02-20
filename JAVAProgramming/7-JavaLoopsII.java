import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    /*Input*/
    Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        
    /*Queries Loop*/
    for(int i=0; i<q ;i++){
        /*Input*/
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        
        /*Series Loop*/
        for(int j=0; j<n; j++)
        {
            a = a + ((int)Math.pow(2,j) * b);
            System.out.printf("%d ", a);
        } 
        System.out.println();
    }
    
    }
}
