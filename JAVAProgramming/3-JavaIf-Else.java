import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        bufferedReader.close();
        
        String out =" ";
        
        if(N%2==1)
        {
            out="Weird";
        }
        else {
            if(2 <= N && N <= 5)
            {
                out="Not Weird";
            }
            else if(6 <= N  && N <= 20)
            {
                out="Weird";
            }
            else if(N > 20)
            {       
                out="Not Weird";
            }  
        }
        System.out.println(out);
    }
}
