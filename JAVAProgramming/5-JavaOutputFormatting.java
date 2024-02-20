import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3 ;i++)
        {
            String S = scanner.next();
            int j = scanner.nextInt();
            /*Here we used C printf to use the formatting*/
            System.out.printf("%-15s%03d\n", S , j );
        }
        System.out.println("================================");
    }
}