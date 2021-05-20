package recursionAssignment;
import java.io.*;

/**
 * class that stores all recursion methods
 */

public class Recursion{
    /**
     * method to count the number of instances a 7 appears in an integer
     */
    public static int count7(int n){
        /**
         * base case when the number is zero it returns zero
         */
        if(n == 0){
            return 0;
        }
        else
        /**
         * recursive case
         * if the left most digit is 7 add one to the counter
         * run through the method again this time removing the left most number
         */
        if(n%10 == 7){
            return 1+count7(n/10);
        }
        /**
         * if the left most number isn't seven, simply remove last number from method
         */
        return count7(n/10);
    }
    /**
     * method to bring all x's in a string to the end of the string
     */
    public static String endX(String str){
        /**
         * base case
         * return empty string when inputted an empty string
         */
        if(str.equals("")){
            return "";
        }
        /** 
         * recursive case
         * while the string is not empty if the first letter of the string is not x move to front
         * rn the through the method again and add it to the end of the first letter
         * make sure to remove the first letter when running through method again
         */
        else
        if((str.substring(0,1)).equals("x") == false){
            return str.substring(0,1)+endX(str.substring(1));
        }else
        /**
         * if the first letter is an x
         * add x to end of the string, run through method again before adding x
         */
        return endX(str.substring(1))+"x";
    }
    /**
     * method to figure out if one number right after another in an array is 10x the former
     */
    public static boolean array220(int[] intNums, int index){
        /**
         * base case
         * if the index reaches the end of the array without returning true return false
         */
        if(index == intNums.length-1){
            return false;
        /**
         * recursive case
         * if the num after the index num is 10x it, return true, method ends
         */
        }else
        if(index <= intNums.length-2 && intNums[index + 1]%intNums[index] == 0 && intNums[index +1]/10 == intNums[index]){
            return true;
        }else
        /**
         * if the num after index num isn't, run method again this time move index up one
         */
        return array220(intNums, index +1);
    } 
}
