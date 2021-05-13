package recursionAssignment;
import java.io.*;

public class Recursion{
    public static int count7(int n){
        if(n == 0){
            return 0;
        }
        else
        if(n%10 == 7){
            return 1+count7(n/10);
        }
        return count7(n/10);
    }
    public static String endX(String str){
        return "xxx";
    }
}
