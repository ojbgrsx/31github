import java.io.*;
import java.util.*;

public class Solution {

    static Scanner scan = new Scanner(System.in);
    static int h = scan.nextInt();
    static int b = scan.nextInt();
    static boolean flag = false;

    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        if (flag){
            System.out.println(b*h);
        }
    }

    static {

        if(h>0 && b>0){
            flag = true;
        }
        else {
            try{
                throw new Exception("Breadth and height must be positive");
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
